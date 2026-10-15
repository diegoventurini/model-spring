package com.venturini.model_spring.infrastructure.repository;

import com.venturini.model_spring.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email);

    @Transactional
    Optional<Usuario> deleteByEmail(String email);
}
