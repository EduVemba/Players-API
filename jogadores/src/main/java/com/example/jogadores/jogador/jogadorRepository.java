package com.example.jogadores.jogador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface jogadorRepository extends
        JpaRepository<Jogador, Long> {

}
