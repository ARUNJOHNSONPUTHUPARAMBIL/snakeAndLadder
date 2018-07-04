package com.ajorgs.snakeandladder.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajorgs.snakeandladder.model.Board;
import com.ajorgs.snakeandladder.model.GameModel;
import com.ajorgs.snakeandladder.model.Player;
import com.ajorgs.snakeandladder.service.GameService;

@RestController
@RequestMapping("/snakeandladder")
public class GameController {
	@Autowired
	GameService service;
	
	@GetMapping("/setgame")
	public Board startTheGame()
	{
		return service.setGame();
	}
	
	
}
