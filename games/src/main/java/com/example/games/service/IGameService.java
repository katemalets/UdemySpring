package com.example.games.service;

import com.example.games.entity.Game;

import java.util.List;

public interface IGameService {
    List<Game> getGames();
    void save(Game game);
    void delete(int id);
    Game showFormForUpdate(int id);
}
