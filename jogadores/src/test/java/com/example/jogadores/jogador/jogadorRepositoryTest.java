package com.example.jogadores.jogador;

import com.example.jogadores.pais.PaisRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class jogadorRepositoryTest {

    @Autowired
    jogadorRepository jogadorRepository;

    @Autowired
    EntityManager em;

    @Test
    @DisplayName("Should get Player successfully from DB")
    void findByNomeAndDobSucces() {
        Jogador data = new Jogador("Eduardo",
                LocalDate.of(200, Month.AUGUST,20),
                "M","BRA");
        this.createJogador(data);
      Optional<Jogador> encontrado =  this.jogadorRepository.findByNomeAndDob(data.getNome(), data.getDob());
      assertThat(encontrado.isPresent()).isTrue();
    }


    private Jogador createJogador(Jogador data) {
        Jogador newUser = new Jogador(data);
        this.em.persist(newUser);
        return newUser;
    }
}