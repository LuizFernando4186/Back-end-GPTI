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
public class Gabarito {
    
    @Id
    private String id;
    private String idAluno;
    private String idProva;
    private String data;
    private String disciplina;
    private String titulo;
    private int nota;
    private String avaliacao;
    private Questao[] questoes;

}
