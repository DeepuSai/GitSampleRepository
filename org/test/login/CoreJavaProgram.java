package org.test.login;

import java.util.Scanner;

public class CoreJavaProgram {
	//Print Even or Odd number program

	public static void main(String[] args) {
		// Even or ODD
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		//int i = sc.nextInt();
		for(int i=1;i<15;i++) {
				if(i%2==0) {
				System.out.println("Even Number" +i);
			}
			else {
				System.out.println("Odd Number"+i);
			}
		
		}

	}
}

