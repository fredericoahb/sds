package com.fredericoahb.sds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fredericoahb.sds.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}