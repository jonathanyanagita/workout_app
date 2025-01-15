package com.workout.workout_app.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sets")
public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Integer reps;

    private Double weight;

    private Double volume;

    private Integer rest = 60;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;


}
