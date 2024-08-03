package com.example.jogadores;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.example.jogadores.jogador.Jogador;
import com.example.jogadores.jogador.JogadorService;
import com.example.jogadores.pais.PaisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class JogadoresApplicationTests {
	@Test
	void contextLoads() {
	}

}