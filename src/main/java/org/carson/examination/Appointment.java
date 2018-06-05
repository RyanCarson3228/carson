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
	private String description;

	public Appointment(String time, String description) {
		this.time = time;
		this.description = description;
	}

	public String getTime() {
		return time;
	}

	public String getDescription() {
		return description;
	}
	
	
}