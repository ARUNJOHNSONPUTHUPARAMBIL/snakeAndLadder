package com.ajorgs.snakeandladder.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajorgs.snakeandladder.model.Board;
import com.ajorgs.snakeandladder.model.GameModel;
import com.ajorgs.snakeandladder.model.Snake;
import com.ajorgs.snakeandladder.service.BoardService;
import com.ajorgs.snakeandladder.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	BoardService service;

	@Override
	public GameModel setGame() {
		Board board = service.createBoard();
		int limit = (int) (Math.random() * 3) + 3;
		List<Snake> snakes = generateSnakes(5);
		System.out.println(snakes);
		return null;
	}

	private List<Snake> generateSnakes(int limit) {
		List<Snake> snakeList = new ArrayList<>();

		for (int i = 0; i < limit; i++) {
			int head = 0;
			int tail = 0;

			do {
				tail = (int) (Math.random() * 20) + 2;
				head = (int) (Math.random() * 20) + 25;
				if (!snakeList.isEmpty()) {
					List<Integer> heads = snakeList.stream().map(Snake::getHead).collect(Collectors.toList());
					List<Integer> tails = snakeList.stream().map(Snake::getTail).collect(Collectors.toList());
					while (heads.contains(head) || tails.contains(head)) {
						head = (int) (Math.random() * 70) + 25;
					}
					while (tails.contains(tail) || heads.contains(tail)) {
						tail = (int) (Math.random() * 70) + 2;
					}

				}
			} while (tail >= head && head - tail <= 9);

			Snake s = new Snake(head, tail);
			snakeList.add(s);
		}

		return snakeList;
	}

}
