package com.br.api.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.br.api.model.Gabarito;

public interface GabaritoRepository extends MongoRepository<Gabarito, String> {

    public List<Gabarito> findByIdAluno(String idAluno);

    public List<Gabarito> findByAvaliacao(String avaliacao);

}