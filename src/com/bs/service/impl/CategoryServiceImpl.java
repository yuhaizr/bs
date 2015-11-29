package com.bs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bs.dao.CategoryDao;
import com.bs.domain.Category;
import com.bs.service.CategoryService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryDao categoryDao;

	public void delete(Long id) {
		categoryDao.delete(id);
	}

	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	public void save(Category category) {
		categoryDao.save(category);
	}

	public Category getById(Long id) {
		return categoryDao.getById(id);
	}

	public void update(Category category) {
		categoryDao.update(category);
	}

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return categoryDao.getPageBean(pageNum, pageSize, queryHelper);
	}
}
