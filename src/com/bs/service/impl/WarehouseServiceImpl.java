package com.bs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bs.dao.WarehouseDao;
import com.bs.domain.Warehouse;
import com.bs.service.WarehouseService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WarehouseServiceImpl implements WarehouseService {

	@Resource
	private WarehouseDao warehouseDao;

	public List<Warehouse> findAll() {
		return warehouseDao.findAll();
	}

	public void delete(Long id) {
		warehouseDao.delete(id);
	}

	public void save(Warehouse warehouse) {
		warehouseDao.save(warehouse);
	}

	public Warehouse getById(Long id) {
		return warehouseDao.getById(id);
	}

	public void update(Warehouse warehouse) {
		warehouseDao.update(warehouse);
	}

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return warehouseDao.getPageBean(pageNum, pageSize, queryHelper);
	}

}
