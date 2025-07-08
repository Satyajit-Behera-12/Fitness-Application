package com.FitnessApplication.www.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FitnessApplication.www.Entity.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

	List<Workout> findByUserId(Long userId);

}
