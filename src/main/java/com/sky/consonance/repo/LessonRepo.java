package com.sky.consonance.repo;

import com.sky.consonance.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<Lesson, Long> {
}
