package com.Txt.DsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Txt.DsList.dto.GameDTO;
import com.Txt.DsList.dto.GameMinDto;
import com.Txt.DsList.entities.Game;
import com.Txt.DsList.service.GameService;
@RestController
@RequestMapping(value = "/games")

public class GameController {
@Autowired
private GameService gameService;


@GetMapping(value = "/{id}")
public GameDTO findById(@PathVariable Long id) {
	GameDTO result = gameService.findById(id);
	return result;
}

@GetMapping 
	public List<GameMinDto>findAll(){
		List<GameMinDto>result= gameService.findAll();
		return result;
	} 
	
	
	
}
