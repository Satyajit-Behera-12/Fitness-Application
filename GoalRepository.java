package com.FitnessApplication.www.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FitnessApplication.www.Entity.Goal;

public interface GoalRepository extends JpaRepository<Goal , Long>{

}
