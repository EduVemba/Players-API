package com.example.jogadores.jogador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {

    private final  jogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(jogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> getPlayers(){
        return jogadorRepository.findAll();
    }

    //TODO: fix this code with error 500
    public void postJogador(Jogador jogador){
        Optional<Jogador> jogadorNumber = jogadorRepository.findById(jogador.getID());
        if(jogadorNumber.isPresent()){
            throw new IllegalStateException("This player is already here");
        }
        jogadorRepository.save(jogador);
    }

    public void deleteJogador(Long id){
        boolean exists = jogadorRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("The jogador with id " + id + " does not exist");
        }
        jogadorRepository.deleteById(id);
    }
}
