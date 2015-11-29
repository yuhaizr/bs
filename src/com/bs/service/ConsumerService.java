package com.bs.service;

import java.util.List;

import com.bs.domain.Consumer;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface ConsumerService {

	List<Consumer> findAll();

	void delete(Long id);

	void save(Consumer consumer);

	Consumer getById(Long id);

	void update(Consumer consumer);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

}
