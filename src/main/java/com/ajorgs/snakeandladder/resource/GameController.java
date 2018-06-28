package com.ajorgs.snakeandladder.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajorgs.snakeandladder.model.GameModel;
import com.ajorgs.snakeandladder.service.GameService;

@RestController
@RequestMapping("/snakeandladder")
public class GameController {
	@Autowired
	GameService service;
	
	@GetMapping("/setgame")
	public GameModel startTheGame()
	{
		return service.setGame();
	}
	

}
