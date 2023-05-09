package br.com.ip.iplist.services;

import br.com.ip.iplist.dto.GameReducedDTO;
import br.com.ip.iplist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameReducedDTO> findAll() {
        return gameRepository.findAll().stream().map(GameReducedDTO::new).toList();
    }
}
