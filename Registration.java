package UserRegValidation;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration { 
	
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the User Registration System.");
		System.out.println("Enter the first name.");
		String firstName = scan.nextLine();
		UserValidationFunction firstNameValidate = firstNameValidate();
		if (firstNameValidate.validateEntry(firstName)) {
			System.out.println("This is a valid first name.");
		}
		else {
			System.out.println("This is not a valid first name.");
		}
		System.out.println("Enter the last name.");
		String lastName = scan.nextLine();
		UserValidationFunction lastNameValidate = lastNameValidate();
		if (lastNameValidate.validateEntry(lastName)) {
			System.out.println("This is a valid last name.");
		}
		else {
			System.out.println("This is not a valid last name.");
		}
		System.out.println("Enter the eMail.");
		String eMail = scan.nextLine();
		UserValidationFunction eMailValidate = eMailValidate();
		if (eMailValidate.validateEntry(eMail)) {
			System.out.println("This is a valid eMail.");
		}
		else {
			System.out.println("This is not a valid eMail.");
		}
		System.out.println("Enter the mobile number.");
		String mobileNumber = scan.nextLine();
		UserValidationFunction mobileNumberValidate = mobileNumberValidate();
		if (mobileNumberValidate.validateEntry(mobileNumber)) {
			System.out.println("This is a valid mobile number.");
		}
		else {
			System.out.println("This is not a valid mobile number.");
		}
		System.out.println("Enter the password.");
		String password = scan.nextLine();
		UserValidationFunction passwordValidate = passwordValidate();
		if (passwordValidate.validateEntry(password)) {
			System.out.println("This is a valid password.");
		}
		else {
			System.out.println("This is not a valid password.");
		}
	}
	public static UserValidationFunction firstNameValidate() {
		UserValidationFunction scan = (String firstName) -> {
			if (firstName.matches("^[A-Z]{1}[a-z]{2,}$"))
				return true;
			else
				return false;
		};
		return scan;
	}
	public static UserValidationFunction lastNameValidate() {
		UserValidationFunction scan = (String lastName) -> {
			if (lastName.matches("^[A-Z]{1}[a-z]{2,}$"))
				return true;
			else
				return false;
		};
		return scan;
	}
	public static UserValidationFunction eMailValidate() {
		UserValidationFunction scan = (String eMail) -> {
			if (eMail.matches("^[a-zA-Z0-9]+([._+-][0-9a-zA-Z])*@*+[a-zA-Z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
				return true;
			else
				return false;
		};
		return scan;
	}
	public static UserValidationFunction mobileNumberValidate() {
		UserValidationFunction scan = (String mobileNumber) -> {
			if (mobileNumber.matches("^[1-9]{2}\\s[1-9]{1}[0-9]{9}$"))
				return true;
			else
				return false;
		};
		return scan;
	}
	public static UserValidationFunction passwordValidate() {
		UserValidationFunction scan = (String password) -> {
			if (password.matches("^(?=.*[@#$%!|'<>.^*()%!])(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[^\\s]{8,}$"))
				return true;
			else
				return false;
		};
		return scan;
	}
}

