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

    @Bean
    CommandLineRunner commandLineRunner(jogadorRepository jogadorRepository, PaisRepository paisRepository) {
        return args -> {
            Pais brasil = new Pais("Brasil", "BRA");
            Pais argentina = new Pais("Argentina", "ARG");

           paisRepository.saveAll(List.of(brasil, argentina));

            Jogador Gilson = new Jogador(
                    "Gilson",
                    LocalDate.of(2000, Month.AUGUST,20),
                    'M'
            );
            Jogador Messi = new Jogador(
                    "Messi",
                    LocalDate.of(1987, Month.JUNE, 24),
                    'M'
            );
            jogadorRepository.saveAll(List.of(Gilson, Messi));

        };
    }


}
