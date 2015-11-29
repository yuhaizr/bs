package com.bs.service;

import java.util.List;

import com.bs.domain.Category;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface CategoryService {

	void delete(Long id);

	List<Category> findAll();

	void save(Category category);

	Category getById(Long id);

	void update(Category category);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

}
