package org.carson.examination;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue
	private long id;

	public Appointment(String time) {
		// TODO Auto-generated constructor stub
	}

	public String getTime() {
		return "3:00PM";
	}
	
	
}