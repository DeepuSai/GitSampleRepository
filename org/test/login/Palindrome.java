package org.test.login;

//to check whether palindrome number or not

public class Palindrome {

	public static void main(String[] args) {

		int num = 192, temp, total = 0, n = 192;
		while (num != 0) {
			temp = num % 10;
			total = (total * 10) + temp;
			num = num / 10;
		}
		if (total == n) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not a palindrome number");
		}
	}

}

