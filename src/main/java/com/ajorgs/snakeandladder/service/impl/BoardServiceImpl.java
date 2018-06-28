package com.ajorgs.snakeandladder.service.impl;

import org.springframework.stereotype.Service;

import com.ajorgs.snakeandladder.model.Board;
import com.ajorgs.snakeandladder.service.BoardService;
@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public Board createBoard() {
		
		return new Board();
	}

}
