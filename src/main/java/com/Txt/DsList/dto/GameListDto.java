package com.Txt.DsList.dto;

import com.Txt.DsList.entities.GameList;

public class GameListDto {
	private Long id;
	private String name;
	
	
	public GameListDto() {
		// TODO Auto-generated constructor stub
	}
	
	public GameListDto(GameList entity) {
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
