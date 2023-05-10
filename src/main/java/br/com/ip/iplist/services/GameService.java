package br.com.ip.iplist.services;

import br.com.ip.iplist.dto.GameDTO;
import br.com.ip.iplist.dto.GameReducedDTO;
import br.com.ip.iplist.entities.Game;
import br.com.ip.iplist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameReducedDTO> findAll() {
        return gameRepository.findAll().stream().map(GameReducedDTO::new).toList();
    }
}
