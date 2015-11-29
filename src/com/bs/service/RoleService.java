package com.bs.service;

import java.util.List;
import java.util.Set;

import com.bs.domain.Role;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface RoleService {

	List<Role> findAll();

	void delete(Long id);

	void save(Role model);

	Role getById(Long id);

	void update(Role model);

	Set<Role> getByIds(Long[] roleIds);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);


}
