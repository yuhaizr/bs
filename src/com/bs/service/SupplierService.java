package com.bs.service;

import java.util.List;

import com.bs.domain.Supplier;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface SupplierService {

	void delete(Long id);

	List<Supplier> findAll();

	void save(Supplier supplier);

	Supplier getById(Long id);

	void update(Supplier supplier);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

}
