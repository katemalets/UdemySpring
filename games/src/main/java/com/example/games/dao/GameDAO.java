package com.example.games.dao;

import com.example.games.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GameDAO implements IGameDAO {

    @Autowired
    private EntityManager entityManager;

    private List<Game> games;

    public List<Game> getGames(){

        games = entityManager
                .createQuery("from Game")
                .getResultList();
        return games;
    }
}
