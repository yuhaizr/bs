package com.bs.dao;

import com.bs.base.BaseDao;
import com.bs.domain.User;

public interface UserDao extends BaseDao<User>{

	void initPassword(Long id);

	User getByLoginNameAndPassword(String loginName, String password);

	User findByLoginName(String loginName);

}
