package com.bs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bs.dao.SystemNoticeDao;
import com.bs.domain.SystemNotice;
import com.bs.service.SystemNoticeService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SystemNoticeServiceImpl implements SystemNoticeService {

	@Resource
	private SystemNoticeDao systemNoticeDao;

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return systemNoticeDao.getPageBean(pageNum, pageSize, queryHelper);
	}

	public SystemNotice getById(Long id) {
		return systemNoticeDao.getById(id);
	}

	public Long getCount(String viewn) {
		return systemNoticeDao.getCount(viewn);
	}

	public void save(SystemNotice systemNotice) {
		systemNoticeDao.save(systemNotice);
	}

	public List<SystemNotice> getNotViewNumber(String viewn) {
		return systemNoticeDao.getNotViewNumber(viewn);
	}

}
