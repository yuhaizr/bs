package com.bs.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.bs.dao.MaterialsDao;
import com.bs.domain.Materials;
import com.bs.service.MaterialsService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MaterialsServiceImpl implements MaterialsService {

	@Resource
	private MaterialsDao materialsDao;

	public void delete(Long id) {
		materialsDao.delete(id);
	}

	public List<Materials> findAll() {
		return materialsDao.findAll();
	}

	public void update(Materials materials) {
		materialsDao.update(materials);
	}

	public void save(Materials materials) {
		materialsDao.save(materials);
	}

	public Materials getById(Long id) {
		return materialsDao.getById(id);
	}

	public Set<Materials> getByIds(Long[] materialsId) {
		return materialsDao.getByIds(materialsId);
	}

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return materialsDao.getPageBean(pageNum, pageSize, queryHelper);
	}
}
