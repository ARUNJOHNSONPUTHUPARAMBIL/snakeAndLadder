package com.ajorgs.snakeandladder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajorgs.snakeandladder.model.Board;
import com.ajorgs.snakeandladder.model.Cell;
import com.ajorgs.snakeandladder.model.Ladder;
import com.ajorgs.snakeandladder.model.Snake;
import com.ajorgs.snakeandladder.repository.BoardRepository;
import com.ajorgs.snakeandladder.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository boardRepo;

	@Override
	public Board createBoard(List<Snake> snakes, List<Ladder> ladders) {
		Board board = new Board();
		for (int i = 0; i < 100; i++) {
			Cell newCell = new Cell();
			newCell.setNumber(i + 1);
			board.getCells().add(newCell);
		}
		for (Snake snake : snakes) {
			board.getCells().get(snake.getHead()).setSnakes(snake);

		}
		for (Ladder ladder : ladders) {
			board.getCells().get(ladder.getHead()).setLadders(ladder);
		}
		Board save = boardRepo.save(board);

		return save;
	}

	@Override
	public String exit() {
		Board b = new Board();
		b.setId(1l);
		 boardRepo.delete(b);
		return "true";
	}

}
