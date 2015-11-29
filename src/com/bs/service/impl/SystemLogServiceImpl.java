package com.bs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bs.dao.SystemLogDao;
import com.bs.domain.Systemlog;
import com.bs.service.SystemLogService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SystemLogServiceImpl implements SystemLogService{

	@Resource
	private SystemLogDao systemLogDao;
	
	public void save(Systemlog systemlog) {
		systemLogDao.save(systemlog);
	}

	public void update(Systemlog systemlog) {
		systemLogDao.update(systemlog);
	}

	public List<Systemlog> findAll() {
		return systemLogDao.findAll();
	}

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return systemLogDao.getPageBean(pageNum, pageSize, queryHelper);
	}

}
