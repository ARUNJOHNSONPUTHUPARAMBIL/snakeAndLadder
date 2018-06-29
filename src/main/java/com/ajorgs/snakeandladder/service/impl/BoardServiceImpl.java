package com.ajorgs.snakeandladder.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajorgs.snakeandladder.model.Board;
import com.ajorgs.snakeandladder.model.Ladder;
import com.ajorgs.snakeandladder.model.Snake;
import com.ajorgs.snakeandladder.service.BoardService;
@Service
public class BoardServiceImpl implements BoardService {


	@Override
	public Board createBoard(List<Snake> snakes, List<Ladder> ladders) {
		Board board = new Board();
		for(Snake snake : snakes)
		{
			board.getCells()[snake.getHead()].setSnakes(snake);
			
		}
		for(Ladder ladder : ladders)
		{
			board.getCells()[ladder.gethead()].setLadders(ladder);			
		}


		return board;
	}

}
