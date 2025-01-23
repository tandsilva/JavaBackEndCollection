package com.Txt.DsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Txt.DsList.entities.Game;
import com.Txt.DsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	
	
	
}
