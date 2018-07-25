package com.ajorgs.snakeandladder.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajorgs.snakeandladder.model.Cell;
import com.ajorgs.snakeandladder.repository.CellRepository;
import com.ajorgs.snakeandladder.service.CellService;

@Service
public class CellServiceImpl implements CellService {
	@Autowired
	CellRepository cellRepo;

	@Override
	public Cell findOne(int i) {
		Optional<Cell> findById = cellRepo.findById((long) i);
		if (findById.isPresent())
			return findById.get();
		return null;
	}

}
