package com.bs.dao;

import java.util.Collection;
import java.util.List;

import com.bs.base.BaseDao;
import com.bs.domain.Privilege;

public interface PrivilegeDao extends BaseDao<Privilege> {

	List<Privilege> findTopList();

	Collection<String> getAllPrivilegeUrls();

	String getByPath(String path);

}
