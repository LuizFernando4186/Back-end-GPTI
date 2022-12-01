package com.br.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@Document
public class Usuario implements Serializable {
    
    @Id
    private String id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;
    private String disciplina;

}