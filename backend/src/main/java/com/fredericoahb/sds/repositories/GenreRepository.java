package com.fredericoahb.sds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.sds.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}