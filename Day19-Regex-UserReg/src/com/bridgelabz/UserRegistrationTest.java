/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Dell
 * Should clear all email samples provided separately
 */

public class UserRegistrationTest {

	public static void main(String[] args) {
		
		UserRegistration userRegistration = new UserRegistration();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName=input.nextLine();
		
		System.out.println("Enter last name");
		String lastName=input.nextLine();
		
		
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
		ArrayList<String> emailList = new ArrayList<String>(Arrays.asList("abc@yahoo.com","abc-100@yahoo.com","abc111@abc.com","abc@1.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com.com","abc@%*.com"));
		for(String emailID : emailList) {
			if(userRegistration.validateEmailAddress(emailID)) {
				System.out.println(emailID + " is valid");
			}else {
				System.out.println(emailID + " is not valid");
			}
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
