package com.FitnessApplication.www.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Workout implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	private int durationInMinutes;
	private int caloriesBurned;
	
	@ManyToOne
	private User user;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDurationInMinutes() {
		return durationInMinutes;
	}
	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	public int getCaloriesBurned() {
		return caloriesBurned;
	}
	public void setCaloriesBurned(int caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}
	
	@Override
	public String toString() {
		return "Workout [id=" + id + ", type=" + type + ", durationInMinutes=" + durationInMinutes + ", caloriesBurned="
				+ caloriesBurned + ", getId()=" + getId() + ", getType()=" + getType() + ", getDurationInMinutes()="
				+ getDurationInMinutes() + ", getCaloriesBurned()=" + getCaloriesBurned() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Workout getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setUser(User user2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
