package com.example.jogadores.domain;

import com.example.jogadores.roles.Roles;

public record RegisterDTO(String nome,String email, String password, Roles role) {
}
