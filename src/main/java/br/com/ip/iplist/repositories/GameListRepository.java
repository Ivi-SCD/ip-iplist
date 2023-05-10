package br.com.ip.iplist.repositories;

import br.com.ip.iplist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
