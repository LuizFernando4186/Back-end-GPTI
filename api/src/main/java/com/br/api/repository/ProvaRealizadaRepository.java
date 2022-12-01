package com.br.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.br.api.model.ProvaRealizada;

public interface ProvaRealizadaRepository extends MongoRepository<ProvaRealizada, String> {


}