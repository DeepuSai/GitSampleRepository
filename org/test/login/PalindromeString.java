package org.test.login;

import java.util.Scanner;

public class PalindromeString {
static String reverse="";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String original = sc.nextLine();
		for(int i=original.length()-1;i>=0;i--) {
			reverse = reverse+original.charAt(i);
			}
		if(original.equals(reverse)) {
			System.out.println("palindrome string");
		}
		else {
			System.out.println("not a palindrome string");
		}
	}

}
