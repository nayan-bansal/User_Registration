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
		
		//Adding Last Name
		
		System.out.println("Enter Last Name: ");
		String last_name  = scan.next();
		
		//Matching Pattern
		
		Pattern last_name_pattern =  Pattern.compile(pattern);
		Matcher m1 = last_name_pattern.matcher(last_name);
		
		if(m1.matches())
		System.out.println("Last Name Follows Pattern :"+last_name);
		else
		System.out.println("Last Name does not follows the pattern");
		
		//Adding Email ID
		
		System.out.println("Enter Email Id: ");
		String email  = scan.next();
				
		//Matching Pattern
		String pattern1 = "^[a-z]{3,3}+(?:.[a-z]{3,3})?+[@]+[a-z]{2,2}+[.]+[a-z]{2,2}+[.]+[a-z]{2,2}$";	
		
		Pattern email_pattern =  Pattern.compile(pattern1);
		Matcher m2 = email_pattern.matcher(email);
				
				if(m2.matches())
				System.out.println("Email Follows Pattern :"+email);
				else
				System.out.println("Email does not follows the pattern");
		
			
		//Valid phone number
				
		System.out.println("Enter The Mobile Number");
		scan.nextLine();
      	String mobile_number=scan.nextLine();
		String pattern2 ="^[1-9]{2}\\s[1-9]{1}[0-9]{9}$";
		Pattern mobile_pattern = Pattern.compile(pattern2);
		Matcher m3 = mobile_pattern.matcher(mobile_number);
      	if(m3.matches()) {
      		System.out.println("Mobile Number follows pattern: "+mobile_number);
      		}
	  	else {
		      		System.out.println("Mobile Number does not follows the pattern");
	      	}
		      	
	//Valid password of minimum 8 characters, 1 number and 1 upper case character
	
      	System.out.println("Enter your password");
		String password=scan.nextLine();
		String pattern3="^(?=.*[@#$%!|'<>.^*()%!])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[^\\\\s]{8,}$";
        Pattern password_pattern = Pattern.compile(pattern3);
        Matcher m4 = password_pattern.matcher(password);
        if(m4.matches()) {
        	System.out.println("password follows pattern: "+password);
		        }
        else {
        	System.out.println("password does not follows the pattern");	

        }
			
        //Checking sample emails\
        
        System.out.println("Enter The Email Id");
        String email_id_sample=scan.next();
        String pattern4 ="^[abc]+((\\.[0-9]+)|(\\+[0-9]+)|(\\-[0-9]+)|([0-9]))*@*+[a-zA-Z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern email_sample = Pattern.compile(pattern4);
        Matcher m5 = email_sample.matcher(email_id_sample);	
        if(m5.matches()) {
        	System.out.println("Email follows pattern: "+email_id_sample);
        }
        else {
        	System.out.println("Email does not follows the pattern");	
        }
	
	}
	
	}
