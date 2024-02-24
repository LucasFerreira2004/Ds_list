package com.lucas.dslist.repositories;

import com.lucas.dslist.entities.GameList;
import com.lucas.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
