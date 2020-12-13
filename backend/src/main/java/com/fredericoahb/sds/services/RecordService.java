package com.fredericoahb.sds.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fredericoahb.sds.dto.RecordDTO;
import com.fredericoahb.sds.dto.RecordInsertDTO;
import com.fredericoahb.sds.entities.Game;
import com.fredericoahb.sds.entities.Record;
import com.fredericoahb.sds.repositories.GameRepository;
import com.fredericoahb.sds.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto ) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);

		entity = repository.save(entity);
		return new RecordDTO(entity);
	}

}
