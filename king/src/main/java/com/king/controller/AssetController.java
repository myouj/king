package com.king.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.entity.Asset;
import com.king.service.IAssetService;
import com.king.utils.ResultInfo;
import com.king.utils.ResultTool;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 下午9:42:52 
* Describe:
*/
@RestController
public class AssetController {
	
	@Autowired
	private IAssetService assetService;
	
	@PostMapping("selectAllAsset")
	public ResultInfo selectAllAsset(int page, int rows) {
		return assetService.selectAllAsset(page, rows);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("insertAsset")
	public Map insertAsset(Asset asset) {
		try {
			assetService.insertAsset(asset);
			return ResultTool.ajaxResult(true, "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultTool.ajaxResult(false, "服务器发生错误，请稍后再试");
	}
	
	@GetMapping("getAsset")
	public Asset getAsset(String id) {
		return assetService.getAsset(id);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("updateAsset")
	public Map updateAsset(Asset asset) {
		try {
			assetService.updateAsset(asset);
			return ResultTool.ajaxResult(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultTool.ajaxResult(false, "服务器发生错误，请稍后再试");
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("deleteAsset")
	public Map deleteAsset(String id) {
		try {
			assetService.deleteAsset(id);
			return ResultTool.ajaxResult(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultTool.ajaxResult(false, "服务器发生错误，请稍后再试");
	}

}
