package com.ajorgs.snakeandladder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ajorgs.snakeandladder.model.Player;
import com.ajorgs.snakeandladder.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Override
	public List<Player> createPlayers(String[] names) {
		List<Player> players = new ArrayList<>();
		for (String name : names) {
			Player newPlayer = new Player(name);
			players.add(newPlayer);

		}
		return players;
	}

}
