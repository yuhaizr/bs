package com.bs.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bs.base.BaseDaoImpl;
import com.bs.domain.XsOrder;
import com.bs.service.XsOrderService;
@Service
@Transactional
public class XsOrderServiceImpl extends BaseDaoImpl<XsOrder> implements
		XsOrderService {

}
