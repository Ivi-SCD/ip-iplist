package br.com.ip.iplist.controllers;

import br.com.ip.iplist.dto.GameListDTO;
import br.com.ip.iplist.dto.GameReducedDTO;
import br.com.ip.iplist.services.GameListService;
import br.com.ip.iplist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameReducedDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

}
