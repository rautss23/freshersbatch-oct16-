package assignment1;

import java.util.HashMap;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> user = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		user.put("Saurabh", 123456);
		user.put("Raut", 9087766);
		System.out.println("Username:");
		String userName = sc.next();
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (count == 3) {
				System.out.println("Contact Admin");
				break;
			}
			if (user.containsKey(userName)) {
				System.out.println("Enter Password:");
				int p = sc.nextInt();
				if (user.get(userName) == p) {
					System.out.println("welcome " + userName);
					break;
				} else {
					count++;
					System.out.println("incorrect password");
				}

			} else {
				{
					count++;
					System.out.println("Incorrect username!");
				}
			}
		}
	}

}
