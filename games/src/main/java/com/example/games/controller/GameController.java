package com.example.games.controller;

import com.example.games.entity.Game;
import com.example.games.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    private IGameService iGameService;

    @GetMapping("/list")
    public String showGames(Model model){
       List<Game> games = iGameService.getGames();
       model.addAttribute("games", games);
       return "games-list";
    }
}
