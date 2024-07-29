package com.example.jogadores.jogador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface jogadorRepository extends
        JpaRepository<Jogador, Long> {

  //  Optional<Jogador> findByNumber(int id);
}
