package com.senai.conversor.controller;

import com.senai.conversor.dto.RequisicaoDto;
import com.senai.conversor.dto.RespostaDto;
import com.senai.conversor.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConversorController {

    @Autowired
    ConversorService service;

    @PostMapping()
    public ResponseEntity<RespostaDto> converter (@RequestBody RequisicaoDto dados){
        RespostaDto resposta = service.Conversao(dados);
        return ResponseEntity.ok().body(resposta);
    }






}
