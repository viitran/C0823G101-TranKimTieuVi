package com.example.demo_btt.controller;

import com.example.demo_btt.model.Pig;
import com.example.demo_btt.model.PigPensty;
import com.example.demo_btt.service.IPigPenstyService;
import com.example.demo_btt.service.IPigService;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PigController {
    @Autowired
    private IPigService iPigService;
    @Autowired
    private IPigPenstyService iPigPenstyService;
    @ModelAttribute("cage")
    public List<PigPensty> pigPensties(){
        return (List<PigPensty>) this.iPigPenstyService.findAll();
    }
    @GetMapping("/")
    public String showList(Model model){
        Iterable<Pig> pigs = this.iPigService.findAll();
        model.addAttribute("pigs",pigs);
        return "/home";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("pig",new Pig());
        return "/create";

    }

    @PostMapping("/create")
    public String create(Pig pig){
        this.iPigService.save(pig);
        return "redirect:/";
    }

    @PostMapping("delete")
    public String removePig(@RequestParam("idDelete") Integer id){
        this.iPigService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/create-cage")
    public String formCreateCage(Model model){
        model.addAttribute("cage",new PigPensty());
        return "/createPensty";
    }

    @PostMapping("/createCage")
    public String createCage(PigPensty pigPensty){
        this.iPigPenstyService.save(pigPensty);
        return "redirect:/cage-pig";
    }

    @GetMapping("/cage-pig")
    public String showPigPensty(Model model){
        Iterable<PigPensty> pigPensties = this.iPigPenstyService.findAll();
        model.addAttribute("cage",pigPensties);
        return "/ListPigPensty";
    }
}
