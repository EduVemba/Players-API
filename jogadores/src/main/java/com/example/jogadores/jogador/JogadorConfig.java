package com.example.jogadores.jogador;


import com.example.jogadores.pais.Pais;
import com.example.jogadores.pais.PaisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class JogadorConfig {

    private PaisRepository paisRepository;

    @Bean
    CommandLineRunner commandLineRunner(jogadorRepository jogadorRepository, PaisRepository paisRepository) {
        return args -> {
            Pais brasil = new Pais("Brasil", "BRA");
            Pais argentina = new Pais("Argentina", "ARG");
            Pais portugual = new Pais("Portugual", "PTL");

            paisRepository.saveAll(List.of(brasil, argentina, portugual));

            Jogador Gilson = new Jogador(
                    "Gilson",
                    LocalDate.of(2000, Month.AUGUST,20),
                    "M",
                    brasil
            );
            Jogador Messi = new Jogador(
                    "Messi",
                    LocalDate.of(1987, Month.JUNE, 24),
                    "M",
                    argentina
            );
            jogadorRepository.saveAll(List.of(Gilson, Messi));

        };
    }


}
