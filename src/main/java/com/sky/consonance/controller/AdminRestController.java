package com.sky.consonance.controller;

import com.sky.consonance.domain.Discipline;
import com.sky.consonance.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/admin")
public class AdminRestController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/disciplines")
    public List<Discipline> getDisciplines() {
        return adminService.getAllDisciplines();
    }

    @PostMapping("/disciplines")
    public Discipline create(
            @RequestBody Discipline discipline
    ) {
        return adminService.createDiscipline(discipline);
    }

}
