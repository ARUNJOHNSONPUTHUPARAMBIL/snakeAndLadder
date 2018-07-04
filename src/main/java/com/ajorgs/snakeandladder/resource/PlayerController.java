package com.ajorgs.snakeandladder.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajorgs.snakeandladder.model.Player;
import com.ajorgs.snakeandladder.service.PlayerService;

@RestController
public class PlayerController {
	PlayerService service;
	
	@GetMapping("/players")
	public List<Player> createPlayers(String[] names)
	{
		return service.createPlayers(names);
	}


}
