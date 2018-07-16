package com.ajorgs.snakeandladder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajorgs.snakeandladder.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
