package com.king.service;

import java.util.List;

import com.king.entity.Asset;
import com.king.utils.ResultInfo;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 下午9:38:09 
* Describe:
*/
public interface IAssetService {
	
	ResultInfo selectAllAsset(int page, int rows);
	
	List<Asset> getAllAsset();
	
	void insertAsset(Asset asset);
	
	Asset getAsset(String id);
	
	void updateAsset(Asset asset);
	
	void deleteAsset(String id);
	
	void insertAssets(List<Asset> assets);

}
