package com.arysaraiva.cadastro_backand.services;

import com.arysaraiva.cadastro_backand.entities.Cadastro;
import com.arysaraiva.cadastro_backand.repositories.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    private final CadastroRepository cadastroRepository; //uma assinatura através de construtor
    public CadastroService(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    public Cadastro saveCadastro(Cadastro cadastro) {
        return cadastroRepository.save(cadastro);
    }


}
