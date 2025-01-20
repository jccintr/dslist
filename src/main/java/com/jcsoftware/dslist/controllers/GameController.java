package com.jcsoftware.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcsoftware.dslist.dto.GameMinDTO;
import com.jcsoftware.dslist.entities.Game;
import com.jcsoftware.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll(){
        List<Game> games = gameService.findAll();
        List<GameMinDTO> gamesDTO = games.stream().map(x-> new GameMinDTO(x)).toList();
        return ResponseEntity.ok().body(gamesDTO);
	}

}
