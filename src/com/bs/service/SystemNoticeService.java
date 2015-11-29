package com.bs.service;

import java.util.List;

import com.bs.domain.SystemNotice;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface SystemNoticeService {

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

	SystemNotice getById(Long id);

	Long getCount(String viewn);

	void save(SystemNotice systemNotice);

	List<SystemNotice> getNotViewNumber(String viewn);

}
