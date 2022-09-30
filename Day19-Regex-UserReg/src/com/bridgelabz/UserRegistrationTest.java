/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * As a User need to follow pre-defined
 * Mobile Format - E.g. 91 9919819801 - Country code follow by space
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
	}

}
