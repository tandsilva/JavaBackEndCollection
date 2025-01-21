package com.Txt.DsList.dto;

import com.Txt.DsList.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDto {
	
	private Long Id;
	private String title;
	
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public Long getId() {
		return Id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public GameMinDto() {}

	public GameMinDto(Game entity) {
	
		Id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	
	

}
