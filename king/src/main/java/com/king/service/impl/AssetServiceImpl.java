package com.king.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.entity.Asset;
import com.king.mapper.AssetMapper;
import com.king.service.IAssetService;
import com.king.utils.DataTool;
import com.king.utils.ResultInfo;
import com.king.utils.ResultTool;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 下午9:39:51 
* Describe:
*/
@Service
public class AssetServiceImpl implements IAssetService {
	
	@Autowired
	private AssetMapper assetMapper;

	@Override
	public ResultInfo selectAllAsset(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<Asset> assets = assetMapper.selectAllAsset();
		PageInfo<Asset> pageInfo = new PageInfo<>(assets);
		return ResultTool.setResult(pageInfo, assets);
	}

	@Override
	public void insertAsset(Asset asset) {
		asset.setId(DataTool.getUuid());
		assetMapper.insertAsset(asset);
		
	}

	@Override
	public Asset getAsset(String id) {
		Asset asset = new Asset();
		asset.setId(id);
		return assetMapper.getAsset(asset);
		
	}

	@Override
	public void updateAsset(Asset asset) {
		assetMapper.updateAsset(asset);
		
	}

	@Override
	public void deleteAsset(String id) {
		Asset asset = new Asset();
		asset.setId(id);
		assetMapper.deleteAsset(asset);
		
	}

	@Override
	public List<Asset> getAllAsset() {
		
		return assetMapper.selectAllAsset();
	}

	@Override
	@Transactional
	public void insertAssets(List<Asset> assets) {
		for (Asset asset : assets) {
			insertAsset(asset);
		}
		
	}

}
