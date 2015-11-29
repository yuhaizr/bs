package com.bs.service;

import java.util.List;

import com.bs.domain.Warehouse;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface WarehouseService {

	List<Warehouse> findAll();

	void delete(Long id);

	void save(Warehouse warehouse);

	Warehouse getById(Long id);

	void update(Warehouse warehouse);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

}
