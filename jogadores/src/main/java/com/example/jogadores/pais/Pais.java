package com.example.jogadores.pais;

import com.example.jogadores.jogador.Jogador;

public class Pais {

    private String nome;
    private String code;

    public Pais() {}

    public Pais(String nome, String code) {
        this.nome = nome;
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
