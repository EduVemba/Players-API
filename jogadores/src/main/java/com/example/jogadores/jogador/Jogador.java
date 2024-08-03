package com.example.jogadores.jogador;


import com.example.jogadores.JogadoresApplication;
import com.example.jogadores.pais.Pais;
import jakarta.persistence.*;

import java.lang.annotation.Target;
import java.time.LocalDate;
import java.time.Period;

@Table
@Entity
public class Jogador {

    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    private Long ID;
    private String nome;
    private LocalDate dob;
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "pais_code",referencedColumnName = "code")
    private Pais pais;
    private String paisNome;

    public Jogador(){}


    public Jogador(Long ID, String nome, LocalDate dob, String sexo,String pais) {
        this.ID = ID;
        this.nome = nome;
        this.dob = dob;
        this.sexo = sexo;
        this.paisNome = pais;

    }
    public Jogador(String nome, LocalDate dob, String sexo,String pais) {
        this.nome = nome;
        this.dob = dob;
        this.sexo = sexo;
        this.paisNome = pais;
    }

    public Jogador(Jogador data) {
        this.ID = data.ID;
        this.nome = data.nome;
        this.dob = data.dob;
        this.sexo = data.sexo;
        this.paisNome = data.paisNome;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getPaisNome(){
        return paisNome;
    }
    public Long getID() {
        return ID;
    }

    public int getAge() {
        return Period.between(dob , LocalDate.now()).getYears();
    }

    public void setPais(Pais pais) {
        this.paisNome = pais.getNome();
    }
}
