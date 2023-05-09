package br.com.ip.iplist.repositories;

import br.com.ip.iplist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
