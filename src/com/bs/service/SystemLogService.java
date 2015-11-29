package com.bs.service;

import java.util.List;

import com.bs.domain.Systemlog;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface SystemLogService {

	void save(Systemlog systemlog);

	void update(Systemlog systemlog);

	List<Systemlog> findAll();

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

	

}
