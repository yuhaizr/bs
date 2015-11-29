package com.bs.service;

import java.util.List;

import com.bs.domain.User;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;

public interface UserService {

	List<User> findAll();

	void delete(Long id);

	void save(User model);

	User getById(Long id);

	void update(User user);

	void initPassword(Long id);

	User getByLoginNameAndPassword(String loginName, String password);

	PageBean getPageBean(int pageNum, int pageSize, QueryHelper queryHelper);

	User findByLoginName(String loginName);


}
