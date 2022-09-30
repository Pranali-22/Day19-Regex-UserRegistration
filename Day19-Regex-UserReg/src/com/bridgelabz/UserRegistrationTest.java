/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * As a User need to follow pre-defined Password rules.
 * Rule1 – minimum 8 Characters 
 * Rule2 - Should have at least 1 Upper Case 
 * Rule3 – Should have at least 1 numeric number in the password 
 */

public class UserRegistrationTest {

	public static void main(String[] args) {
		
		UserRegistration userRegistration = new UserRegistration();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName=input.nextLine();
		
		System.out.println("Enter last name");
		String lastName=input.nextLine();
		
		System.out.println("Enter email address");
		String emailID=input.nextLine();
		
		System.out.println("Enter mobile number");
		String mobileNumber = input.nextLine();
		
		System.out.println("Enter password");
		String password = input.nextLine();
		
		//Checking if first name is valid or not
		if(userRegistration.validateFirstName(firstName)) {
			System.out.println("First name is valid");
		}else {
			System.out.println("First name is not valid");
		}
		
		
		//Checking if last name is valid or not
		if(userRegistration.validateLastName(lastName)) {
			System.out.println("Last name is valid");
		}else {
			System.out.println("Last name is not valid");
		}

		
		//Checking if email Id is valid or not
		if(userRegistration.validateEmailAddress(emailID)) {
			System.out.println("Email address is valid");
		}else {
			System.out.println("Email address is not valid");
		}
		
		
		//Checking mobile number
		if(userRegistration.validateMobileNumber(mobileNumber)) {
			System.out.println("Mobile number is valid");
		}else {
			System.out.println("Mobile number is not valid");
		}
		
		//Checking for password
		if(userRegistration.validatePassword(password)) {
			System.out.println("Password is valid");
		}else {
			System.out.println("Password is not valid");
		}
		
	}

}
