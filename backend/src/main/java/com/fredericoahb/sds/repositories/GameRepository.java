package com.fredericoahb.sds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fredericoahb.sds.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}