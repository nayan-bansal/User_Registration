package UserRegValidation;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration { 
	
	// String Pattern Declaration
	public static final  String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	public static final  String LAST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	public static final  String EMAIL = "^[a-z]{3,3}+(?:.[a-z]{3,3})?+[@]+[a-z]{2,2}+[.]+[a-z]{2,2}+[.]+[a-z]{2,2}$";;
	public static final  String MOBILE = "^[1-9]{2}\\\\s[1-9]{1}[0-9]{9}$";;
	public static final  String PASSWORD = "^(?=.*[@#$%!|'<>.^*()%!])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[^\\\\\\\\s]{8,}$";;
	
	//First Name Function
	public static boolean  first_name(String name) {
		
		Pattern pattern =  Pattern.compile(FIRST_NAME);
		Matcher m = pattern.matcher(name);
		return m.matches();
	}
	
	//Last Name Function
		public static boolean  last_name(String name) {
			
			Pattern pattern =  Pattern.compile(LAST_NAME);
			Matcher m = pattern.matcher(name);
			return m.matches();
		}
		
	//Email Function
		public static boolean  email_id(String name) {
			
			Pattern pattern =  Pattern.compile(EMAIL);
			Matcher m = pattern.matcher(name);
			return m.matches();
		}
		
	//Phone Number Function
		public static boolean  phone_number(String name) {
			
			Pattern pattern =  Pattern.compile(MOBILE);
			Matcher m = pattern.matcher(name);
			return m.matches();
		}
	
	//Password Function
		public static boolean  password(String name) {
			
			Pattern pattern =  Pattern.compile(PASSWORD);
			Matcher m = pattern.matcher(name);
			return m.matches();
		}
	
	
public static void main(String[] args) {
		
		//Printing Welcome Message
		System.out.println("Welcome to User Registration Program");
		
		//Adding First Name
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String first_name  = scan.next();

		if(first_name(first_name) == true)
		System.out.println("First Name Follows Pattern :"+first_name);
		else
		System.out.println("First Name does not follows the pattern");
		
		System.out.println("Enter Last Name: ");
		String last_name  = scan.next();

		if(first_name(last_name) == true)
		System.out.println("Last Name Follows Pattern :"+last_name);
		else
		System.out.println("Last Name does not follows the pattern");
		
		System.out.println("Enter Email Id: ");
		String email_id  = scan.next();

		if(first_name(email_id) == true)
		System.out.println("Email Id Follows Pattern :"+email_id);
		else
		System.out.println("Email Id does not follows the pattern");
		
		System.out.println("Enter Phone Number: ");
		String phone  = scan.next();

		if(first_name(phone) == true)
		System.out.println("Phone Number Follows Pattern :"+phone);
		else
		System.out.println("Phone Number does not follows the pattern");
		
		scan.nextLine();
		System.out.println("Enter Password: ");
		String password  = scan.next();

		if(first_name(password) == true)
		System.out.println("Password Follows Pattern :"+first_name);
		else
		System.out.println("Password does not follows the pattern");
	
	}
}

