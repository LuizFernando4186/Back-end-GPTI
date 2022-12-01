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
public class Prova {
    
    @Id
    public String id;
    public String id_professor;
    public String data;
    public String disciplina;
    public String titulo;
    public Questao[] questao; 

}
