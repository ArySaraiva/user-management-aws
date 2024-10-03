package com.arysaraiva.cadastro_backand.repositories;

import com.arysaraiva.cadastro_backand.entities.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro,Long> {
}
