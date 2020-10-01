package Registration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	public static void main(String[] args) {
		
		//Printing Welcome Message
		System.out.println("Welcome to User Registration Program");
		
		//Adding First Name
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String first_name  = scan.next();
		
		String pattern = "^[A-Z]{1}[a-z]{2,}$";
		
		//Matching Pattern
		
		Pattern first_name_pattern =  Pattern.compile(pattern);
		Matcher m = first_name_pattern.matcher(first_name);
		
		if(m.matches())
		System.out.println("First Name Follows Pattern :"+first_name);
		else
		System.out.println("First Name does not follows the pattern");
		
	
	}
	
}
