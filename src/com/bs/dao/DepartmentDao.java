package com.bs.dao;

import java.util.List;

import com.bs.base.BaseDao;
import com.bs.domain.Department;

public interface DepartmentDao extends BaseDao<Department>{

	List<Department> findTopList();

	List<Department> findChildren(Long parentId);

}
