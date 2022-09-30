/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Dell
 * As a User need to enter
 * a valid Last
 * Name - Last name
 *
 */
public class UserRegistration {

	//Validate first name
	public boolean validateFirstName(String firstName) {
		String nameRegex =  "^[A-Z]{1}[a-z]{2,}$";
		return firstName.matches(nameRegex);
	}
	
	//Validate last name
	public boolean validateLastName(String lastName) {
		String nameRegex =  "^[A-Z]{1}[a-z]{2,}$";
		return lastName.matches(nameRegex);
	}
	
	//Validate email address
	public boolean validateEmailAddress(String emailId) {
		String nameRegex = "^[a-z]{1,}(.[a-z]{1,})?@bl.co(.in)?$";
		return emailId.matches(nameRegex);
	}

}
