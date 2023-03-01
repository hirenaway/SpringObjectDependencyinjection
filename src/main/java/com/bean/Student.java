package com.bean;

import lombok.Data;

@Data
public class Student {

	private Integer studentId;
	private String studentName;
	private University uni;

	public void assignedUni() {
		System.out.println("Assigning Uni...");
		uni.goingToUni();
	}

	public void init() {
		System.err.println("Initialized");
	}

	public void destroy() {
		System.err.println("Destroyed");
	}
}
