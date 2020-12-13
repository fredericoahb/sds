package com.fredericoahb.sds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.sds.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}