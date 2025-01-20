package com.workout.workout_app.Repository;

import com.workout.workout_app.Entities.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, UUID> {
}
