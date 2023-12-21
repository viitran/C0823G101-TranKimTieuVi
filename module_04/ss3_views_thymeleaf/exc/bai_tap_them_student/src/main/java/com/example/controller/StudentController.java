package com.example.controller;

import com.example.model.Student;
import com.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @GetMapping("/")
    public String home(Model model) {
        List<Student> students = iStudentService.showList();
        model.addAttribute("students", students);
        return "/view";
    }

    @GetMapping("/create")
    public String create() {
        return "/create";
    }

    @PostMapping("/create")
    public String create(Student student) {
        iStudentService.addNew(student);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id, Model model){
        model.addAttribute("students",iStudentService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Student student){
        iStudentService.update(student.getId(), student);
        return "redirect:/";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("students",iStudentService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Student student){
        int id = student.getId();
        iStudentService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/sort")
    public String sort(Model model){
        List<Student> students = iStudentService.sortByAge();
        model.addAttribute("students",students);
        return "/view";
    }


}
