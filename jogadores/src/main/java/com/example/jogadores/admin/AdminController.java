package com.example.jogadores.admin;

import com.example.jogadores.jogador.Jogador;
import com.example.jogadores.jogador.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private JogadorService jogadorService;

    @PostMapping("/add")
    public void addJogador(@RequestBody Jogador jogador) {
        jogadorService.postJogador(jogador);
    }

    @RequestMapping("/delete")
    @DeleteMapping(path = "{playerId}")
    public void deleteJogadores(@PathVariable("playerId") Long id) {
        jogadorService.deleteJogador(id);
    }
}
