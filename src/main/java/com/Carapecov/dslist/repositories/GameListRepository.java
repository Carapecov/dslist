package com.Carapecov.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Carapecov.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
