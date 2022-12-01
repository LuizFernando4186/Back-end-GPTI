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
public class ProvaRealizada {
    
    @Id
    private String id_aluno;
    private String nome;
    private String data;
    private String disciplina;
    private String titulo;
    private int nota_final;
}
