package com.bs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bs.dao.UserDao;
import com.bs.domain.User;
import com.bs.service.UserService;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	public List<User> findAll() {
		return userDao.findAll();
	}

	public void delete(Long id) {
		userDao.delete(id);
	}

	public void save(User user) {
		userDao.save(user);
	}

	public User getById(Long id) {
		return userDao.getById(id);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void initPassword(Long id) {
		userDao.initPassword(id);
	}

	public User getByLoginNameAndPassword(String loginName, String password) {
		return userDao.getByLoginNameAndPassword(loginName, password);
	}

	public PageBean getPageBean(int pageNum, int pageSize,
			QueryHelper queryHelper) {
		return userDao.getPageBean(pageNum, pageSize, queryHelper);
	}

	public User findByLoginName(String loginName) {
		return userDao.findByLoginName(loginName);
	}

}
