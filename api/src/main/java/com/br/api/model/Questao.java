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
public class Questao {
    
    @Id
    private String id;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String alternativaCorreta;
    private String textoAberta;
    private int abertaOuFechada;
    private String disciplina;
    private String titulo;
    private String enunciado;
    public double notaQuestaoAberta;
    public double notaQuestao;

}
