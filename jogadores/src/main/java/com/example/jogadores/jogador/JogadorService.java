package com.example.jogadores.jogador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class JogadorService {

    private jogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(jogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> getPlayers(){
        return jogadorRepository.findAll();
    }
}
