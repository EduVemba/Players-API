package com.example.jogadores.roles;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin_read"),
    ADMIN_POST("admin_post"),
    ADMIN_DELETE("admin_delete"),
    ADMIN_ADD("admin_add"),
    ADMIN_EDIT("admin_edit");

    @Getter
    private final String permission;
}
