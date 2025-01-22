package com.Txt.DsList.entities;

import java.util.Objects;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class BelongingPK {
	   //a interface obriga a ter apenas um id ,nao pode ser mais de um atributo
		//criada uma chave auxiliar para representar uma chave primaria multlipla
	@ManyToOne 
	@JoinColumn(name = "game_id")
	private Game game;
	@ManyToOne 
	@JoinColumn(name = "list_id")
	private GameList list;
	public BelongingPK() {}
	
	
	public BelongingPK(Game game, GameList list) {
		
		this.game = game;
		this.list = list;
	}


	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
	
	
	
	
	
	
	
}
