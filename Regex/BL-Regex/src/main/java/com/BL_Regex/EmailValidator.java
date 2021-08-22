package com.BL_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator
{
		// Email Regex java
		//private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		private static final String emailRegex="^[A-Za-z0-9]+(([._+-] {0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		
		// static Pattern object, since pattern is fixed
		private static Pattern pattern;

		// non-static Matcher object because it's created from the input String
		private Matcher matcher;

		public EmailValidator() {
			// initialize the Pattern object
			//pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
			pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
		}

		
		public boolean validateEmail(String email) {
			matcher = pattern.matcher(email);
			return matcher.matches();
		}
}
