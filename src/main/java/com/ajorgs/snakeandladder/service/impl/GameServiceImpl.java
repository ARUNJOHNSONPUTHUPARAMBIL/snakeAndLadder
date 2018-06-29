package com.ajorgs.snakeandladder.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajorgs.snakeandladder.model.Board;
import com.ajorgs.snakeandladder.model.GameModel;
import com.ajorgs.snakeandladder.model.Ladder;
import com.ajorgs.snakeandladder.model.Player;
import com.ajorgs.snakeandladder.model.Snake;
import com.ajorgs.snakeandladder.service.BoardService;
import com.ajorgs.snakeandladder.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	BoardService service;

	@Override
	public Board setGame() {
		int limit = (int) (Math.random() * 3) + 3;
		List<Snake> snakes = generateSnakes(5);
		List<Ladder> ladders = generateLadders(5, snakes);
		Board board = service.createBoard(snakes, ladders);

		return board;
	}

	private List<Snake> generateSnakes(int limit) {
		List<Snake> snakeList = new ArrayList<>();

		for (int i = 0; i < limit; i++) {
			int head = 0;
			int tail = 0;

			do {
				tail = (int) (Math.random() * 70) + 2;
				head = (int) (Math.random() * 70) + 25;
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
			} while (tail >= head || head - tail <= 9);

			Snake s = new Snake(head, tail);
			snakeList.add(s);
		}

		return snakeList;
	}

	private List<Ladder> generateLadders(int limit, List<Snake> snakes) {
		List<Ladder> ladderList = new ArrayList<>();

		for (int i = 0; i < limit; i++) {
			int head = 0;
			int tail = 0;

			do {
				tail = (int) (Math.random() * 70) + 6;
				head = (int) (Math.random() * 70) + 28;
				if (!ladderList.isEmpty()) {
					List<Integer> ladderHeads = ladderList.stream().map(Ladder::gethead).collect(Collectors.toList());
					List<Integer> ladderTails = ladderList.stream().map(Ladder::gettail).collect(Collectors.toList());
					List<Integer> snakeHeads = snakes.stream().map(Snake::getHead).collect(Collectors.toList());
					List<Integer> snakeTails = snakes.stream().map(Snake::getTail).collect(Collectors.toList());
					while (ladderHeads.contains(head) || ladderTails.contains(head) || snakeHeads.contains(head)
							|| snakeTails.contains(head)) {
						head = (int) (Math.random() * 70) + 28;
					}
					while (ladderTails.contains(tail) || ladderHeads.contains(tail) || snakeHeads.contains(tail)
							|| snakeTails.contains(tail)) {
						tail = (int) (Math.random() * 70) + 6;
					}

				}
			} while (tail >= head || head - tail <= 9);

			Ladder s = new Ladder(head, tail);
			ladderList.add(s);
		}

		return ladderList;
	}

	@Override
	public List<Player> createPlayers(String[] names) {

		return null;
	}

}
