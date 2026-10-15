package com.venturini.model_spring.infrastructure.repository;

import com.venturini.model_spring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
