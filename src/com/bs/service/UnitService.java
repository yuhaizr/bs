package com.bs.service;

import java.util.List;
import java.util.Set;

import com.bs.domain.Unit;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface UnitService {

	List<Unit> findAll();

	void delete(Long id);

	void save(Unit unit);

	Unit getById(Long id);

	void update(Unit unit);

	Set<Unit> getByIds(Long[] unitId);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

}
