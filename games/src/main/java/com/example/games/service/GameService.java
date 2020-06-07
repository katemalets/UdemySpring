package com.example.games.service;

import com.example.games.dao.IGameDAO;
import com.example.games.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameService implements IGameService {

    @Autowired
    private IGameDAO iGameDAO;

    @Override
    public List<Game> getGames() {
        return iGameDAO.getGames();
    }
}
