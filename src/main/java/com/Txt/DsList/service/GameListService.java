package com.Txt.DsList.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Txt.DsList.dto.GameDTO;
import com.Txt.DsList.dto.GameListDto;
import com.Txt.DsList.dto.GameMinDto;
import com.Txt.DsList.entities.Game;
import com.Txt.DsList.entities.GameList;

import com.Txt.DsList.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
//	@Transactional(readOnly = true)
//	public GameDTO findById(Long id) {
//		Game result = gameRepository.findById(id).get();
//		GameDTO  dto= new GameDTO(result);
//		return dto;
//	
//	}    
//	@Transactional(readOnly = true)
//	public GameDTO findById(Long id) {
//	    Optional<Game> result = gameRepository.findById(id);
//	    
//	    return result.map(game -> new GameDTO(game))
//	                 .orElse(null); // Retorna null caso o Game não seja encontrado
//	}


	@Transactional(readOnly = true)
	public List<GameListDto> findAll(){
	List<GameList> result= gameListRepository.findAll();
	return  result.stream().map(x-> new GameListDto(x)).toList();
			
}
	
	
	
	
	
}
