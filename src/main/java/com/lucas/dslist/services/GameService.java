package com.lucas.dslist.services;

import com.lucas.dslist.dto.GameMinDTO;
import com.lucas.dslist.entities.Game;
import com.lucas.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Temos que indicar que é um compontene... @Componente tbm funcionaria
public class GameService {
    @Autowired //injetando um componente em outro
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
