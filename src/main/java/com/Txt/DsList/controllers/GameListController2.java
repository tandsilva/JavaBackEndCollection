package com.Txt.DsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Txt.DsList.dto.GameDTO;
import com.Txt.DsList.dto.GameListDto;
import com.Txt.DsList.dto.GameMinDto;
import com.Txt.DsList.entities.Game;
import com.Txt.DsList.service.GameListService;
import com.Txt.DsList.service.GameService;
@RestController
@RequestMapping(value = "/lists")

public class GameListController2 {
@Autowired
private GameListService gameListService;


//@GetMapping(value = "/{id}")
//public GameDTO findById(@PathVariable Long id) {
//	GameDTO result = gameService.findById(id);
//	return result;
//}

@GetMapping 
	public List<GameListDto>findAll(){
		List<GameListDto>result= gameListService.findAll();
		return result;
	} 
	
	
	
}
