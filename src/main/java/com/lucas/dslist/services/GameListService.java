package com.lucas.dslist.services;

import com.lucas.dslist.dto.GameListDTO;
import com.lucas.dslist.dto.GameMinDTO;
import com.lucas.dslist.entities.Game;
import com.lucas.dslist.entities.GameList;
import com.lucas.dslist.repositories.GameListRepository;
import com.lucas.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
