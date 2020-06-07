package com.example.games.controller;

import com.example.games.entity.Game;
import com.example.games.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {

    @Autowired
    private IGameService iGameService;

    @GetMapping("/list")
    public String showGames(Model model){
       List<Game> games = iGameService.getGames();
       model.addAttribute("games", games);
       return "games-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        Game game = new Game();
        model.addAttribute("game", game);
        return "game-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("game") Game game){
        iGameService.save(game);
        return "redirect:/games/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("gameId") int id, Model model){
        Game game = iGameService.showFormForUpdate(id);
        model.addAttribute("game", game);
        return "game-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("gameId") int id){
        iGameService.delete(id);
        return "redirect:/games/list";
    }

}
