package com.FitnessApplication.www.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FitnessApplication.www.Entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	User findByname(String name);

	Optional<User> findById(Long userId);
}
