package assignment1;

import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int query = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == query) {
				System.out.println("Your number was at index: " + i);
				break;
			} else {

			}
		}
	}
}
