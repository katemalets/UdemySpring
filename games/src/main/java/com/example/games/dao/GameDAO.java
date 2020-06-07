package com.example.games.dao;

import com.example.games.entity.Game;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GameDAO implements IGameDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Game> getGames(){
        return entityManager
                .unwrap(Session.class)
                .createQuery("from Game")
                .getResultList();
    }

    @Override
    @Transactional
    public void save(Game game) {
       entityManager.unwrap(Session.class)
                    .saveOrUpdate(game);
    }

    @Override
    @Transactional
    public void delete(int id) {
        entityManager.unwrap(Session.class)
                     .createQuery("delete from Game where id=:gameId")
                     .setParameter("gameId",id)
                     .executeUpdate();
    }

    @Override
    @Transactional
    public Game showFormForUpdate(int id) {
        return entityManager
                .unwrap(Session.class)
                .get(Game.class,id);
    }
}
