/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.mt86.jweb.modules.sys.dao;

import java.util.List;

import com.mt86.jweb.common.persistence.CrudDao;
import com.mt86.jweb.common.persistence.annotation.MyBatisDao;
import com.mt86.jweb.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
