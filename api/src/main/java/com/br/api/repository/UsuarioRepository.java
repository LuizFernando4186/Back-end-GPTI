package com.br.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.br.api.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
    @Query("{'login': ?0,'senha': ?1}")
    public Usuario obterPessoaPorLoginSenha(String login, String senha);

}