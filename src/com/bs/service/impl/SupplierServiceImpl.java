package com.bs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bs.dao.SupplierDao;
import com.bs.domain.Supplier;
import com.bs.service.SupplierService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

	@Resource
	private SupplierDao supplierDao;

	public void delete(Long id) {
		supplierDao.delete(id);

	}

	public List<Supplier> findAll() {
		return supplierDao.findAll();
	}

	public void save(Supplier supplier) {
		supplierDao.save(supplier);
	}

	public Supplier getById(Long id) {
		return supplierDao.getById(id);
	}

	public void update(Supplier supplier) {
		supplierDao.update(supplier);
	}

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return supplierDao.getPageBean(pageNum, pageSize, queryHelper);
	}

}
