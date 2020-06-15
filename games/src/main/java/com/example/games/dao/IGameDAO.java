package com.example.games.dao;

import com.example.games.entity.Game;

import java.util.List;

public interface IGameDAO {

    List<Game> getGames();

    void save(Game game);

    void delete(int id);

    Game showFormForUpdate(int id);
}
