package com.Txt.DsList.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Txt.DsList.dto.GameMinDto;
import com.Txt.DsList.entities.Game;
import com.Txt.DsList.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDto> findAll(){
	List<Game> result= gameRepository.findAll();
	List<GameMinDto> dto = result.stream().map(x-> new GameMinDto(x)).toList();
			
	return dto;
		
	}
	
	
	
	
	
}
