package com.sky.consonance.controller;

import com.sky.consonance.domain.Discipline;
import com.sky.consonance.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/discipline")
    public String getDisciplines(Model model) {
        List<Discipline> allDisciplines = adminService.getAllDisciplines();
        model.addAttribute("disciplines", allDisciplines);
        return "discipline";
    }

    @PostMapping("/discipline")
    public String addDiscipline(
            Discipline discipline,
            Model model
    ) {
        adminService.createDiscipline(discipline);
        model.addAttribute("disciplines", adminService.getAllDisciplines());
        return "discipline";
    }
}
