package com.sky.consonance.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
public class Teacher extends User{

    @ManyToMany
    @JoinTable(
            name = "teacher_student",
            joinColumns = {@JoinColumn(name = "teacher_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    private Set<Student> students;

}
