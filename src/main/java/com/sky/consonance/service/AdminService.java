package com.sky.consonance.service;

import com.sky.consonance.domain.Discipline;

import java.util.List;

public interface AdminService {
    Discipline createDiscipline(Discipline discipline);

    List<Discipline> getAllDisciplines();
}
