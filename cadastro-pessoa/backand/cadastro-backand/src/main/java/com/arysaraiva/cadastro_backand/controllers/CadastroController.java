package com.arysaraiva.cadastro_backand.controllers;

import com.arysaraiva.cadastro_backand.entities.Cadastro;
import com.arysaraiva.cadastro_backand.services.CadastroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastros")
@CrossOrigin("*")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    private static final Logger logger = LoggerFactory.getLogger(CadastroController.class);


    @PostMapping
    public ResponseEntity<Cadastro> registerUser(@RequestBody Cadastro cadastro) {

        System.out.println("Recebendo usuário: " + cadastro);
        Cadastro savedCadastro = cadastroService.saveCadastro(cadastro);
        logger.info("Usuário salvo: " + savedCadastro);
        return ResponseEntity.ok(savedCadastro);
    }
}