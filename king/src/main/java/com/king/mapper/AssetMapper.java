package com.king.mapper;

import java.util.List;

import com.king.entity.Asset;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 下午9:35:30 
* Describe:
*/
public interface AssetMapper {
	
	List<Asset> selectAllAsset();
	
	void insertAsset(Asset asset);
	
	Asset getAsset(Asset asset);
	
	void updateAsset(Asset asset);
	
	void deleteAsset(Asset asset);

}
