package com.sky.consonance.service;

import com.sky.consonance.domain.Discipline;
import com.sky.consonance.repo.DisciplineRepo;
import com.sky.consonance.repo.LessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private LessonRepo lessonRepo;
    private DisciplineRepo disciplineRepo;

    @Autowired
    public AdminServiceImpl(LessonRepo lessonRepo, DisciplineRepo disciplineRepo) {
        this.lessonRepo = lessonRepo;
        this.disciplineRepo = disciplineRepo;
    }

    @Override
    public Discipline createDiscipline(Discipline discipline) {
        Discipline createdDiscipline = disciplineRepo.save(discipline);
        return createdDiscipline;
    }

    @Override
    public List<Discipline> getAllDisciplines() {
        return disciplineRepo.findAll();
    }
}
