package com.sky.consonance.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table
@EqualsAndHashCode(of = "id")
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private int costPerHour;
}
