package com.jcsoftware.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcsoftware.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
