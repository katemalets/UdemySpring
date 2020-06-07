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

    @Override
    public void save(Game game) {
        iGameDAO.save(game);
    }

    @Override
    public void delete(int id) {
        iGameDAO.delete(id);
    }

    @Override
    public Game showFormForUpdate(int id) {
        return iGameDAO.showFormForUpdate(id);
    }
}
