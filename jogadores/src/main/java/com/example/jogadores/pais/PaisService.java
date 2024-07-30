package com.example.jogadores.pais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    public Pais findByCode(String code) {
        return paisRepository.findById(code).orElse(null);
    }
}
