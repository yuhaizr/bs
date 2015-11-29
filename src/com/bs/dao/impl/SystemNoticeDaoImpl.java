package com.bs.dao.impl;

import java.util.List;

import com.bs.base.BaseDaoImpl;
import com.bs.dao.SystemNoticeDao;
import com.bs.domain.SystemNotice;
import org.springframework.stereotype.Repository;

@Repository
public class SystemNoticeDaoImpl extends BaseDaoImpl<SystemNotice> implements
		SystemNoticeDao {

	public Long getCount(String viewn) {
		return (Long) getSession().createQuery("SELECT COUNT(*) FROM SystemNotice s WHERE s.viewyn=?").setParameter(0, viewn).uniqueResult();
	}

	public Long getNotViewNumber() {
		return (Long) getSession().createQuery("SELECT COUNT(*) FROM SystemNotice s WHERE s.viewyn='NO'").uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<SystemNotice> getNotViewNumber(String viewn) {
		viewn="NO";
		return getSession().createQuery("FROM SystemNotice s WHERE s.viewyn=?").setParameter(0, viewn).list();
	}

}
