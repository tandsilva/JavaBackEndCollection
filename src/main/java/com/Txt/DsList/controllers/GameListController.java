package com.Txt.DsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Txt.DsList.dto.GameListDTO;
import com.Txt.DsList.dto.GameMinDTO;
import com.Txt.DsList.service.GameListService;
import com.Txt.DsList.service.GameService;
@RestController
@RequestMapping(value = "/lists")

public class GameListController {
@Autowired
private GameListService gameListService;
@Autowired
private GameService gameService;

//@GetMapping(value = "/{id}")
//public GameDTO findById(@PathVariable Long id) {
//	GameDTO result = gameService.findById(id);
//	return result;
//}

@GetMapping 
	public List<GameListDTO>findAll(){
		List<GameListDTO>result= gameListService.findAll();
		return result;
	} 
	
//concatenando id da lista / games
@GetMapping(value = "/{listId}/games")
public List<GameMinDTO>findByList(@PathVariable Long listId){
	List<GameMinDTO>result= gameService.findByList(listId);
	return result;
} 
	
}
