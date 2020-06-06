package com.example.games.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/list")
    public String showGames(){
        return "games-list";
    }
}
