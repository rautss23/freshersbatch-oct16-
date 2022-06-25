package lamdaExpression;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total rice of order: ");
		int price=sc.nextInt();
		System.out.println("enter the status of your order: 1)accepted or Completed 2) ordered");
		int status=sc.nextInt();
		
		acceptance determine=(c,v)->{
			if(c>10000 && v==1) {
				System.out.println("your order of amount "+price+" is accepted and completed");
			}
			else if(c<10000) {
				System.out.println("the amount of order is not processable");
			}
			else {
				System.out.println("your order's status is ambitious right now");
			}
		};
		determine.decision(price, status);

	}

}
interface acceptance{
	void decision(int a, int b);
}
