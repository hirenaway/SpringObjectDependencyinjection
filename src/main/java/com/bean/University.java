package com.bean;

import lombok.Data;

@Data
public class University {

	private String uniName;

	public void goingToUni() {
		System.out.println("Assigned Uni: "+ uniName);
	}
}
