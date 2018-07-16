package com.ajorgs.snakeandladder.service;

import java.util.List;

import com.ajorgs.snakeandladder.model.Board;
import com.ajorgs.snakeandladder.model.Ladder;
import com.ajorgs.snakeandladder.model.Snake;

public interface BoardService {

	public Board createBoard(List<Snake> snakes, List<Ladder> ladders);

	public String exit();

}
