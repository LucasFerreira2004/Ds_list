package com.lucas.dslist.services;

import com.lucas.dslist.dto.GameDTO;
import com.lucas.dslist.dto.GameMinDTO;
import com.lucas.dslist.entities.Game;
import com.lucas.dslist.projections.GameMinProjection;
import com.lucas.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //Temos que indicar que é um compontene... @Componente tbm funcionaria
public class GameService {
    @Autowired //injetando um componente em outro
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game game = gameRepository.findById(id).get(); //podem ser feitos tratamentos de exeção para id null
        return new GameDTO(game);
    }
}
