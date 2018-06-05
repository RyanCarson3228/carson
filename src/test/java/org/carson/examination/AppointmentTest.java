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
		underTest = new Appointment(time);
		String actual = underTest.getTime();
		assertThat(actual, is(time));
		
	}
	
}