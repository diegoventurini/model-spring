package com.venturini.model_spring.infrastructure.repository;

import com.venturini.model_spring.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
