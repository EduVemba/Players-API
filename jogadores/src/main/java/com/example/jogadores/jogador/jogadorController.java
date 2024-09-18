package com.example.jogadores.jogador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/games")
public class jogadorController {

   private final JogadorService jogadorService;

   @Autowired
    public jogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/players")
    public List<Jogador> getJogadores() {
        return jogadorService.getPlayers();
    }
    @PutMapping(path = "{playerId}")
    public void updateStudent(
            @PathVariable("playerId") Long playerId,
            @RequestBody(required = false) String name,
            @RequestParam(required = false) String sexo,
            @RequestParam(required = false) String code,
            @RequestParam(required = false) LocalDate dob) {
        jogadorService.updatePlayer(playerId,name,sexo,code,dob);
    }}
