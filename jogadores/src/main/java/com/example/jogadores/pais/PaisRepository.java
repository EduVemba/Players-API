package com.example.jogadores.pais;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaisRepository extends
        JpaRepository<Pais, String> {


    Optional<Pais> findByCode(String code);
}
