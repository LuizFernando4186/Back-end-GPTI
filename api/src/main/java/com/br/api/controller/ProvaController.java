package com.br.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.br.api.model.*;
import com.br.api.repository.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

@RestController
@RequestMapping("/controller")
public class ProvaController {
    
    @Autowired 
    ProvaRepository provaRepository;

    @Autowired 
    ProvaRealizadaRepository provaRealizadaRepository;

    @Autowired 
    QuestaoRespository questaoRepository;

    @Autowired 
    UsuarioRepository usuarioRepository;

    @Autowired 
    GabaritoRepository gabaritoRepository;

   
    @PostMapping(value = "/adicionar/prova", produces = "application/json")
    public ResponseEntity<Prova> adicionarProva(@RequestBody Prova criar_prova){
    
    Date dataHoraAtual = new Date();

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
    String data = dateFormat.format(dataHoraAtual);

    criar_prova.data = data;

    Prova prova = provaRepository.save(criar_prova);
       
    if(Objects.isNull(prova)) return ResponseEntity.notFound().build();
    else return ResponseEntity.ok(prova);

    }

    @PostMapping(value = "/adicionar/usuario", produces = "application/json")
    public ResponseEntity<Usuario> adicionarProva(@RequestBody Usuario criar_usuario){
    
    Usuario usuario = usuarioRepository.save(criar_usuario);
       
    if(Objects.isNull(usuario)) return ResponseEntity.notFound().build();
    else return ResponseEntity.ok(usuario);

    }

    @PostMapping(value = "/adicionar/questao", produces = "application/json")
    public ResponseEntity<Questao> adicionarProva(@RequestBody Questao criar_questao){
    
    Questao questao = questaoRepository.save(criar_questao);
       
    if(Objects.isNull(questao)) return ResponseEntity.notFound().build();
    else return ResponseEntity.ok(questao);

    }


    @PostMapping(value = "/adicionar/realizada", produces = "application/json")
    public ResponseEntity<ProvaRealizada> adicionarProva(@RequestBody ProvaRealizada prova_realizada){
    
    ProvaRealizada prova = provaRealizadaRepository.save(prova_realizada);
       
    if(Objects.isNull(prova)) return ResponseEntity.notFound().build();
    else return ResponseEntity.ok(prova);
    }

    @PostMapping(value = "/adicionar/gabarito", produces = "application/json")
    public ResponseEntity<Gabarito> adicionarGabarito(@RequestBody Gabarito criar_gabarito){
    
    Date dataHoraAtual = new Date();

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
    String data = dateFormat.format(dataHoraAtual);
    
    criar_gabarito.setData(data);

    Gabarito prova = gabaritoRepository.save(criar_gabarito);
       
    if(Objects.isNull(prova)) return ResponseEntity.notFound().build();
    else return ResponseEntity.ok(prova);

    }


    @GetMapping(value = "/login", produces = "application/json")
    public Usuario login(@RequestParam(value = "login") String login, @RequestParam(value = "senha") String senha){
        Usuario pessoa = this.usuarioRepository.obterPessoaPorLoginSenha(login,senha);
       
        return pessoa;
    }

    @GetMapping(value = "/listar/gabarito", produces = "application/json")
    public List<Gabarito> gabaritos(@RequestParam(value = "id_aluno") String id){
        List<Gabarito> list = this.gabaritoRepository.findByIdAluno(id);
       
        return list;
    }

    @GetMapping(value = "/listar/gabarito/avaliacao", produces = "application/json")
    public List<Gabarito> gabaritosAvaliacao(@RequestParam(value = "avaliacao") String avaliacao){
        System.out.println("entrou avaliacao");
        List<Gabarito> list = this.gabaritoRepository.findByAvaliacao(avaliacao);
       
        return list;
    }

    @GetMapping(value = "/listar/realizar", produces = "application/json")
    public List<ProvaRealizada> realizar(){
        List<ProvaRealizada> list = this.provaRealizadaRepository.findAll();
       
        return list;
    }

    @GetMapping(value = "/listar/prova", produces = "application/json")
    public List<Prova> provas(){
        List<Prova> list = this.provaRepository.findAll();
       
        return list;
    }

    @GetMapping(value = "/listar/questoes", produces = "application/json")
    public List<Questao> questoes(@RequestParam(value = "disciplina") String disciplina){
        List<Questao> list = this.questaoRepository.findByDisciplina(disciplina);
       
        return list;
    }


}