package br.com.ip.iplist.dto;

import br.com.ip.iplist.entities.Game;

public record GameReducedDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public GameReducedDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
}
