package com.example.jogadores.jogador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;


@Repository
public interface jogadorRepository extends
        JpaRepository<Jogador, Long> {

    Optional<Jogador> findByNomeAndDob(String nome, LocalDate dob);
}
