/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Dell
 *
 */
public class UserRegistration {

	/**
	 * @param args
	 */
	//Validate first name
	public static boolean validateFirstName(String firstName) {
		String nameRegex =  "^[A-Z]{1}[a-z]{2,}$";
		 return firstName.matches(nameRegex);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName=input.nextLine();
		
		if(validateFirstName(firstName)) {
			System.out.println("First name is valid");
		}else {
			System.out.println("First name is not valid");
		}

	}

}
