import static org.junit.Assert.*;
import org.junit.Test;
public class UserEntryTest {
	@Test
	public void happyTest() {
		boolean expectedFirstName=true;
		boolean actualFirstName=Registration.firstNameCheck("Nayan");
		assertEquals(expectedFirstName,actualFirstName);
		boolean expectedLastName=true;
		boolean actualLastName=Registration.lastNameCheck("Bansal");
		assertEquals(expectedLastName,actualLastName);
		boolean expectedEMail=true;
		boolean actualEMail=Registration.eMailCheck("abc@yahoo.com");
		assertEquals(expectedEMail,actualEMail);
		boolean expectedMobileNumber=true;
		boolean actualMobileNumber=Registration.mobileNumberCheck("91 9416029025");
		assertEquals(expectedMobileNumber,actualMobileNumber);
		boolean expectedPassword=true;
		boolean actualPassword=Registration.passwordCheck("Asdf1234%");
		assertEquals(expectedPassword,actualPassword);
	}
	public void sadTest() {
		boolean expectedFirstName=false;
		boolean actualFirstName=Registration.firstNameCheck("nayan");
		assertEquals(expectedFirstName,actualFirstName);
		boolean expectedLastName=false;
		boolean actualLastName=Registration.lastNameCheck("bansal");
		assertEquals(expectedLastName,actualLastName);
		boolean expectedEMail=false;
		boolean actualEMail=Registration.eMailCheck("abc@com");
		assertEquals(expectedEMail,actualEMail);
		boolean expectedMobileNumber=false;
		boolean actualMobileNumber=Registration.mobileNumberCheck("911 9416029025");
		assertEquals(expectedMobileNumber,actualMobileNumber);
		boolean expectedPassword=false;
		boolean actualPassword=Registration.passwordCheck("asdf1234");
		assertEquals(expectedPassword,actualPassword);
	}
}
