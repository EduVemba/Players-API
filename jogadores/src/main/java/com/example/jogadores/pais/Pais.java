package com.example.jogadores.pais;

import com.example.jogadores.jogador.Jogador;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Pais {

    @Id
    private String code;
    private String nome;

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
