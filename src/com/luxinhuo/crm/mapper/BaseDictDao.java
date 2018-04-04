package com.luxinhuo.crm.mapper;

import java.util.List;

import com.luxinhuo.crm.pojo.BaseDict;

public interface BaseDictDao {

	
	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
