package Assignment1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		int num, originalNumber, remainder, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");

		num = sc.nextInt();
		System.out.println("You Entered: " + num);

		originalNumber = num;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;

		}
		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");

	}

}
