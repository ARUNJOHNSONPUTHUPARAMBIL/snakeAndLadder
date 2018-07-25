package com.ajorgs.snakeandladder.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajorgs.snakeandladder.model.Cell;
import com.ajorgs.snakeandladder.service.CellService;

@RestController
public class CellController {

	@Autowired
	CellService service;

	@GetMapping("/cell")
	public Cell getCell() {
		return service.findOne(10);
	}
}
