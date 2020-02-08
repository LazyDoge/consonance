package com.sky.consonance.repo;

import com.sky.consonance.domain.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepo extends JpaRepository<Discipline, Long> {
}
