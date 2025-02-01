package com.Txt.DsList.DTO;

import com.Txt.DsList.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	
	public GameListDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
