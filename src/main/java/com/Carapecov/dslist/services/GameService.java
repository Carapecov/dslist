package com.Carapecov.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Carapecov.dslist.dto.GameminDTO;
import com.Carapecov.dslist.entities.Game;
import com.Carapecov.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameminDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameminDTO(x)).toList();
	}
}
