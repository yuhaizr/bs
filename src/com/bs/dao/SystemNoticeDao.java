package com.bs.dao;

import java.util.List;

import com.bs.base.BaseDao;
import com.bs.domain.SystemNotice;

public interface SystemNoticeDao extends BaseDao<SystemNotice> {

	Long getCount(String viewn);

	List<SystemNotice> getNotViewNumber(String viewn);

}
