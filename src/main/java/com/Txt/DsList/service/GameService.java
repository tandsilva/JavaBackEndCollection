package com.Txt.DsList.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Txt.DsList.dto.GameDTO;
import com.Txt.DsList.dto.GameMinDTO;
import com.Txt.DsList.entities.Game;
import com.Txt.DsList.exceptions.GameNotFoundException;
import com.Txt.DsList.projections.GameMinProjection;
import com.Txt.DsList.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO  dto= new GameDTO(result);
		return dto;
	
	}    
//	@Transactional(readOnly = true)
//	public GameDTO findById(Long id) {
//	    Optional<Game> result = gameRepository.findById(id);
//	    
//	    return result.map(game -> new GameDTO(game))
//	                 .orElse(null); // Retorna null caso o Game não seja encontrado
//	}


	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
	List<Game> result= gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
			
	return dto;
		
	}
	//estou convertendo meu projection para DTO //porque minha lista soh retorna dto 
	@Transactional(readOnly = true)
	public List<GameMinDTO>findByList(Long listId){
		List<GameMinProjection> result= gameRepository.searchByList(listId);
		return result.stream().map(x-> new GameMinDTO(x)).toList();
	}
	
	
	
}
