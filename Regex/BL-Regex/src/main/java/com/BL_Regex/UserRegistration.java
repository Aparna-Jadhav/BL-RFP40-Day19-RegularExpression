package com.BL_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter FirstName :");
    	String firstName=sc.next();
    	System.out.println("Enter LastName :");
    	String lastName=sc.next();
    	System.out.println("Enter Mobile No :");
    	String mobile=sc.next();
    	System.out.println("Enter Password :");
    	String password=sc.next();
    	
        System.out.println("First Name: "+firstName+" => "+userFirstName(firstName));
        System.out.println("Last Name: "+lastName+" => "+userLastName(lastName));
        System.out.println("Mobile No: "+mobile+" => "+userMobile(mobile));
        System.out.println("Password: "+password+" => "+userPassword(password));
    }

   
	private static boolean userFirstName(String firstName) {
		String regex1="^[A-Z]{1}+[a-z]{2,}$";
		Pattern pattern=Pattern.compile(regex1);
		Matcher matcher1=pattern.matcher(firstName);
		return matcher1.matches();
	}
	
	private static boolean userLastName(String lastName) {
		String regex2="^[A-Z]{1}+[a-z]{2,}$";
		Pattern pattern=Pattern.compile(regex2);
		Matcher matcher2=pattern.matcher(lastName);
		return matcher2.matches();
	}
	
	private static boolean userMobile(String mobile) {
		 String regex3="(0/91)?[7-9][0-9]{9}";
		 Pattern pattern=Pattern.compile(regex3);
		 Matcher matcher3=pattern.matcher(mobile);
		 return matcher3.matches();
		}

	private static boolean userPassword(String password) {
		String regex4="^[A-Z]{1}+[0-9]{1}+[a-z]{5}+[!@#$%^&*]{1}$";
		Pattern pattern=Pattern.compile(regex4);
		Matcher matcher4=pattern.matcher(password);
		return matcher4.matches();
	}

}
