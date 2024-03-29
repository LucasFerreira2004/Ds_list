package com.lucas.dslist.controllers;

import com.lucas.dslist.dto.GameDTO;
import com.lucas.dslist.dto.GameMinDTO;
import com.lucas.dslist.entities.Game;
import com.lucas.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/games") //necessário sinalizar o caminho pra api
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping //necessário mapear
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
