package com.example.jogadores.jogador;


import com.example.jogadores.pais.Pais;
import com.example.jogadores.pais.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class JogadorService {

    private final  jogadorRepository jogadorRepository;
    private final PaisRepository paisRepository;

    @Autowired
    public JogadorService(jogadorRepository jogadorRepository, PaisRepository paisRepository) {
        this.jogadorRepository = jogadorRepository;
        this.paisRepository = paisRepository;
    }


    public List<Jogador> getPlayers(){
        return jogadorRepository.findAll();
    }

    public void postJogador(Jogador jogador){
        Optional<Jogador> jogadorExistente = jogadorRepository.findByNomeAndDob(jogador.getNome(), jogador.getDob());
        if (jogadorExistente.isPresent()){
            throw new IllegalStateException("This player is already here");
        }
        jogadorRepository.save(jogador);
    }

    public void deleteJogador(Long id){
        boolean exists = jogadorRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("The jogador with id " + id + " does not exist");
        }
        jogadorRepository.deleteById(id);
    }

    public void updatePlayer(Long playerId,
                                String name,
                                String sexo,
                                String code,
                                LocalDate dob) {
        Jogador empregado = jogadorRepository.findById(playerId)
                .orElseThrow(() -> new IllegalStateException(
                        "Student with id: "+ playerId + " does not exist"));
        if(name != null &&
                name.length() > 3 &&
                !Objects.equals(empregado.getNome(), name)) {
            empregado.setNome(name);
        }
        if (sexo != null) {
            if (!sexo.equals("F") && !sexo.equals("M")) {
                throw new IllegalArgumentException("Sexo must be 'F' or 'M'");
            }
            empregado.setSexo(sexo);

            //TODO: rever essa parte do codigo
            if (code != null) {
                Optional<Pais> paisOptional = paisRepository.findByCode(code);
                if (!paisOptional.isPresent())
                    throw new IllegalArgumentException("Country with code: " + code + " does not exist");
                Pais pais = paisOptional.get();
                empregado.setPais(pais);
            }
            //----------------------------------------------------------------

            if (dob != null && !Objects.equals(empregado.getDob(), dob)) {
                empregado.setDob(dob);
            }
            empregado.setDob(dob);
        }
        jogadorRepository.save(empregado);
    }
}
