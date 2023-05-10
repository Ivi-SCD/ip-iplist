package br.com.ip.iplist.dto;

import br.com.ip.iplist.entities.Game;
import br.com.ip.iplist.projections.GameReducedProjection;

public record GameReducedDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public GameReducedDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }

    public GameReducedDTO(GameReducedProjection projection) {
        this(projection.getId(), projection.getTitle(), projection.getYear(), projection.getImgUrl(), projection.getShortDescription());
    }
}
