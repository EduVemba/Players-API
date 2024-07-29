package com.example.jogadores.jogador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/games")
public class jogadorController {

   private final JogadorService jogadorService;

   @Autowired
    public jogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping
    public List<Jogador> getJogadores() {
        return jogadorService.getPlayers();
    }
    @DeleteMapping(path = "jogadorId")
    public void deleteJogadores(@PathVariable("jogadorId") Long id) {
       jogadorService.deleteJogador(id);
    }
}
