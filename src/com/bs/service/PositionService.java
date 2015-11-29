package com.bs.service;

import java.util.List;

import com.bs.domain.Position;

public interface PositionService {

	List<Position> findAll();

	void delete(Long id);

	void save(Position position);

	Position getById(Long id);

	void update(Position position);

}
