package com.sky.consonance.repo;

import com.sky.consonance.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {
}
