package com.fredericoahb.sds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.sds.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}