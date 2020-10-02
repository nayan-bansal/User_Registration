package UserRegValidation;

import static org.junit.Assert.*;
import org.junit.Test;

public class Validation {

	@Test
	public void positiveTest() {
		boolean expectedFirstName=true;
		boolean actualFirstName= Registration.first_name("Nayan");
		assertEquals(expectedFirstName,actualFirstName);
		boolean expectedLastName=true;
		boolean actualLastName=Registration.last_name("Bansal");
		assertEquals(expectedLastName,actualLastName);
		boolean expectedEMail=true;
		boolean actualEMail=Registration.email_id("abc@yahoo.com");
		assertEquals(expectedEMail,actualEMail);
		boolean expectedMobileNumber=true;
		boolean actualMobileNumber=Registration.phone_number("91 9416029025");
		assertEquals(expectedMobileNumber,actualMobileNumber);
		boolean expectedPassword=true;
		boolean actualPassword=Registration.password("Asdf1234%");
		assertEquals(expectedPassword,actualPassword);

	}
	public void negativeTest() {
		boolean expectedFirstName=false;
		boolean actualFirstName=Registration.first_name("nayan");
		assertEquals(expectedFirstName,actualFirstName);
		boolean expectedLastName=false;
		boolean actualLastName=Registration.last_name("bansal");
		assertEquals(expectedLastName,actualLastName);
		boolean expectedEMail=false;
		boolean actualEMail=Registration.email_id("abc@com");
		assertEquals(expectedEMail,actualEMail);
		boolean expectedMobileNumber=false;
		boolean actualMobileNumber=Registration.phone_number("911 992331990");
		assertEquals(expectedMobileNumber,actualMobileNumber);
		boolean expectedPassword=false;
		boolean actualPassword=Registration.password("dfff1234");
		assertEquals(expectedPassword,actualPassword);
	}
}