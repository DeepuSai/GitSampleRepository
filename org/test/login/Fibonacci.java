package org.test.login;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0, second=1, third;
		System.out.print("01");
		for(int i = 3;i<=20;i++) {
			third = first+second;
			System.out.print(third);
			first = second;
			second = third;
			
		}

	}

}
