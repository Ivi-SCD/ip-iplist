package br.com.ip.iplist.controllers;

import br.com.ip.iplist.dto.GameReducedDTO;
import br.com.ip.iplist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameReducedDTO> findAll() {
        return gameService.findAll();
    }
}
