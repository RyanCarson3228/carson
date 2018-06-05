package org.carson.examination;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String time;

	public Appointment(String time, String description) {
		this.time = time;
	}

	public String getTime() {
		return time;
	}

	public String getDescription() {
		return "coffee";
	}
	
	
}