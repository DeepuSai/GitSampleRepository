package org.test.login;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153, temp, total = 0;
		int armNo = 153;
		while (num != 0) {
			temp = num % 10;
			total = total + temp * temp * temp;
			num /= 10;

		}
		if (total == armNo) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not an armstrong number");
		}
	}

}
