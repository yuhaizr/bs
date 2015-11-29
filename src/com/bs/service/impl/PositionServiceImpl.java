package com.bs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.bs.dao.PositionDao;
import com.bs.domain.Position;
import com.bs.service.PositionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PositionServiceImpl implements PositionService {

	@Resource
	private PositionDao positionDao;

	public List<Position> findAll() {
		return positionDao.findAll();
	}

	public void delete(Long id) {
		positionDao.delete(id);
	}

	public void save(Position position) {
		positionDao.save(position);
	}

	public Position getById(Long id) {
		return positionDao.getById(id);
	}

	public void update(Position position) {
		positionDao.update(position);
	}
	
	
}
