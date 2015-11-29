package com.bs.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.bs.domain.Privilege;

public interface PrivilegeService {

	List<Privilege> findAll();

	Set<Privilege> getByIds(Long[] privilegeIds);

	List<Privilege> findTopList();
	
	Collection<String> getAllPrivilegeUrls();

	String getByPath(String path);
}
