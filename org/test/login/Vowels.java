package org.test.login;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String vowel = "aeiou";
		// String name = "Green Technology";
		String result = "";
		// Get the name from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String name = sc.nextLine();
		// for loop to get the each char of the given name
		// for loop will be iterated depends upon the given name length
		for (int i = 0; i < name.length(); i++) {
			// get the char from specific index
			char charOfName = name.charAt(i);
			// check the vowel string contains the current char
			if (vowel.indexOf(charOfName) >= 0) {
				// add current char twice and also add result String to result
				result = result + String.valueOf(charOfName) + String.valueOf(charOfName);;
			} else {
				// char is not a vowel, so add char tp result String only once
				result = result + String.valueOf(charOfName);
			}
		}
		System.out.println("vowels string : " + result);
	}

}
