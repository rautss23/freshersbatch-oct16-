package lamdaExpression;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers: ");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		
		System.out.println("Your choices 1)Add 2)substract 3)Multiply 4)Divide : ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			Calculator add =(x,y)-> System.out.println(x+y);
			add.foo(num1, num2);
			break;
		
		case 2:
			Calculator sub=(x,y)-> System.out.println(x-y);
			sub.foo(num1, num2);
			break;
			
		case 3:
			Calculator multiply=(x,y)->System.out.println(x*y);
			multiply.foo(num1, num2);
			break;
			
		case 4:
			Calculator div=(x,y)-> System.out.println(x/y);
			div.foo(num1, num2);
			break;
			
				
		}
	}

}

interface Calculator{
	void foo(double num1,double num2);
}
