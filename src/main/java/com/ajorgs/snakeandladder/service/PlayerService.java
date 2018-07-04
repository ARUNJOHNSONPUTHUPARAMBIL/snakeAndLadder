package com.ajorgs.snakeandladder.service;

import java.util.List;

import com.ajorgs.snakeandladder.model.Player;

public interface PlayerService {

	List<Player> createPlayers(String[] names);

}
