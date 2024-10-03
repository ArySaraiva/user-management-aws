package com.arysaraiva.cadastro_backand.services;
import com.arysaraiva.cadastro_backand.entities.Cadastro;
import com.arysaraiva.cadastro_backand.repositories.CadastroRepository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @InjectMocks
    private CadastroService cadastroService;

    @Mock
    private CadastroRepository cadastroRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveUser() {
        Cadastro cadastro = new Cadastro();
        cadastro.setId(1L);
        cadastro.setName("John Doe");

        when(cadastroRepository.save(cadastro)).thenReturn(cadastro);

        Cadastro savedCadastro = cadastroService.saveCadastro(cadastro);

        assertNotNull(savedCadastro);
        assertEquals("John Doe", savedCadastro.getName());
        verify(cadastroRepository, times(1)).save(cadastro);
    }
}