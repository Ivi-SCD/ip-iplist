package br.com.ip.iplist.dto;

import br.com.ip.iplist.entities.GameList;

public record GameListDTO (Long id, String name) {

    public GameListDTO(GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}
