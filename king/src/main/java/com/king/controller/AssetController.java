package com.king.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.service.IAssetService;
import com.king.utils.ResultInfo;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 下午9:42:52 
* Describe:
*/
@RestController
public class AssetController {
	
	@Autowired
	private IAssetService assetService;
	
	@PostMapping("getAsset")
	public ResultInfo getAsset(int page, int rows) {
		return assetService.selectAllAsset(page, rows);
	}

}
