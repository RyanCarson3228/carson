package org.carson.examination;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AppointmentTest {

	@Mock
	private Appointment underTest;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldHaveTimeThreePM() {
		String time = "3:00PM";
		underTest = new Appointment(time, null);
		String actual = underTest.getTime();
		assertThat(actual, is(time));
	}
	
	@Test
	public void shouldHaveTimeTenAM() {
		String time = "10:00AM";
		underTest = new Appointment(time, null);
		String actual = underTest.getTime();
		assertThat(actual, is(time));
	}
	
	@Test
	public void shouldHaveDescriptionCoffee() {
		String description = "coffee";
		underTest = new Appointment(null, description);
		String actual = underTest.getDescription();
		assertThat(actual, is(description));
	}
	
	@Test
	public void shouldHaveDescriptionDrinks() {
		String description = "drinks";
		underTest = new Appointment(null, description);
		String actual = underTest.getDescription();
			assertThat(actual, is(description));
	}
	
//	@Test
//	public void shouldHaveTwoDifferentIdAppointmentsNotBeEqual() {
//		Appointment appointment = new Appointment(1L);
//		Appointment appointmentOther = new Appointment(2L);
//		boolean actual = appointment.equals(appointmentOther);
//		assertThat(actual, is(false));
//	}
	
}
