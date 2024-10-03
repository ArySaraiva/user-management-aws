package com.arysaraiva.cadastro_backand.controllers;

import com.arysaraiva.cadastro_backand.entities.Cadastro;
import com.arysaraiva.cadastro_backand.services.CadastroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CadastroControllerTest {
    @InjectMocks
    private CadastroController cadastroController;

    @Mock
    private CadastroService cadastroService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegisterUser() {
        Cadastro cadastro = new Cadastro(); // Adicione os atributos necessários
        cadastro.setName("John Doe"); // Exemplo de atributo
        when(cadastroService.saveCadastro(any(Cadastro.class))).thenReturn(cadastro);

        ResponseEntity<Cadastro> response = cadastroController.registerUser(cadastro);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(cadastro, response.getBody());
    }
}