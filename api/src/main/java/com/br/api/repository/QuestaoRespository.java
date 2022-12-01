package com.br.api.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.br.api.model.Questao;

public interface QuestaoRespository extends MongoRepository<Questao, String> {

    public List<Questao> findByDisciplina(String disciplina);

}