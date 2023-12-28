package com.example.song.controller;

import com.example.song.model.Song;
import com.example.song.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    private ISongService iSongService;

    @GetMapping("/")
    public String showList(Model model){
        List<Song> list = (List<Song>) iSongService.findAll();
        model.addAttribute("songs",list);
        return "/home";
    }

    @GetMapping("/create")
    public String formCreate(Model model){
        model.addAttribute("song",new Song());
        return "/create";
    }

    @PostMapping("/validation")
    public String checkValidation(@Validated @ModelAttribute("song") Song song,
                                  BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        }
        iSongService.save(song);
        return ("/home");
    }

    @GetMapping("/{id}/edit")
    public String formEdit(@PathVariable Integer id, Model model){
        model.addAttribute("song",iSongService.findById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String create(@Validated @ModelAttribute("song") Song song, BindingResult bindingResult ){
        if (bindingResult.hasFieldErrors()) {
            return "/edit";
        }
        iSongService.save(song);
        return "redirect:/";
    }
}
