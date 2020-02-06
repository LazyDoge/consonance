package com.sky.consonance.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
public class Student extends User {

    long balance;

    @Enumerated(EnumType.STRING)
    Status status;

}
