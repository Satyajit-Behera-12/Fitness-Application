package com.FitnessApplication.www.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FitnessApplication.www.Entity.Workout;
import com.FitnessApplication.www.ExceptionHandling.GlobalExceptionHandler;
import com.FitnessApplication.www.FitnessApplication;
import com.FitnessApplication.www.Repository.UserRepository;
import com.FitnessApplication.www.Repository.WorkoutRepository;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private WorkoutRepository workoutRepository;

	@PostMapping
	public Workout logWorkout(@RequestBody Workout workout) {
	    Long userId = workout.getUser().getId();
	    
	    // Fetch the user from the repository
	    var user = userRepository.findById(userId)
	            .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
	    
	    // Set the fully populated user to the workout
	    workout.setUser(user);
	    
	    // Save the workout
	    return workoutRepository.save(workout);
	}

	@GetMapping("/user/{userId}")
	public List<Workout>getWorkouts(@PathVariable Long userId){
		return workoutRepository.findByUserId(userId);
	}
	
}
