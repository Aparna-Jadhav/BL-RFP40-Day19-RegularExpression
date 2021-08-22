package com.BL_Regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailValidatorTest {

		// list of valid email addresses
		private static final String[] validEmailIds = new String[] {"abc@yahoo.com", "abc-100@yahoo.com",
				"abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
				"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
				"abc+100@gmail.com"};

		// list of invalid email addresses
		private static final String[] invalidEmailIds = new String[] {"abc", "abc@.com.my",
				"abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
				"abc()*@gmail.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au"};

		private static EmailValidator emailValidator;

		public static void main(String args[]) {
			emailValidator = new EmailValidator();
			for (String temp : validEmailIds) {
				boolean valid = emailValidator.validateEmail(temp);
				System.out.println("Email ID : " + temp + " => " + valid);
			}
			System.out.println("\n\n");
			for (String temp : invalidEmailIds) {
				boolean valid = emailValidator.validateEmail(temp);
				System.out.println("Email ID : " + temp + " => " + valid);
			}
		}
}
