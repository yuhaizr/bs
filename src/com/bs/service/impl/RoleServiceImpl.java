package com.bs.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.bs.dao.RoleDao;
import com.bs.domain.Role;
import com.bs.service.RoleService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDao roleDao;

	public List<Role> findAll() {
		return roleDao.findAll();
	}

	public void delete(Long id) {
		roleDao.delete(id);
	}

	public void save(Role role) {
		roleDao.save(role);
	}

	public Role getById(Long id) {
		return roleDao.getById(id);
	}

	public void update(Role role) {
		roleDao.update(role);
	}

	public Set<Role> getByIds(Long[] roleIds) {
		return roleDao.getByIds(roleIds);
	}

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return roleDao.getPageBean(pageNum, pageSize, queryHelper);
	}

}
