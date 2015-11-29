package com.bs.dao.impl;

import java.util.List;

import com.bs.base.BaseDaoImpl;
import com.bs.dao.DepartmentDao;
import com.bs.domain.Department;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements
		DepartmentDao {

	
	public List<Department> findTopList() {
		return getSession().createQuery(//
				"FROM Department d WHERE d.parent IS NULL")//
				.list();
	}

	public List<Department> findChildren(Long parentId) {
		return (List<Department>) getSession().createQuery(//
				"FROM Department d WHERE d.parent.id=?")//
				.setParameter(0, parentId)//
				.list();
	}

}
