package com.bs.service;

import java.util.List;
import java.util.Set;

import com.bs.domain.Materials;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface MaterialsService {

	void delete(Long id);

	List<Materials> findAll();

	void update(Materials materials);

	void save(Materials materials);

	Materials getById(Long id);

	Set<Materials> getByIds(Long[] materialsId);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

}
