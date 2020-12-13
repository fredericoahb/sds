package com.fredericoahb.sds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fredericoahb.sds.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}