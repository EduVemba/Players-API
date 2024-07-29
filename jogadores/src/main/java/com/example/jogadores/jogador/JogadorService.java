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

    //TODO: fix this code with 404 error.
    public void deleteJogador(Long id){
        boolean exists = jogadorRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("The jogador with id " + id + " does not exist");
        }
        jogadorRepository.deleteById(id);
    }
}
