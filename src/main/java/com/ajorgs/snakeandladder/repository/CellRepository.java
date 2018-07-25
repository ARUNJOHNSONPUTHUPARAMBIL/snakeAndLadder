package com.ajorgs.snakeandladder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajorgs.snakeandladder.model.Cell;
@Repository
public interface CellRepository extends JpaRepository<Cell, Long> {

	
}
