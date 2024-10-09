package com.example.jogadores.domain;

import com.example.jogadores.roles.UserRole;

public record RegisterDTO(String nome, String email, String password, UserRole role) {
}
