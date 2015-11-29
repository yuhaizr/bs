package com.bs.dao.impl;

import java.util.List;

import com.bs.base.BaseDaoImpl;
import com.bs.dao.SystemLogDao;
import com.bs.domain.Systemlog;
import org.springframework.stereotype.Repository;

@Repository
public class SystemLogDaoImpl extends BaseDaoImpl<Systemlog> implements
		SystemLogDao {
	@Override
	public List<Systemlog> findAll() {
		
		return super.findAll();
	}
}
