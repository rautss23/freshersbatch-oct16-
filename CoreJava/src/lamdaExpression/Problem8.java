package lamdaExpression;

import java.util.ArrayList;

public class Problem8 {

	public static void main(String[] args) {
		Thread execute = new thread();
		System.out.println(Thread.currentThread());
		execute.start();

	}

}
 class thread extends Thread{
	 public void run() {
		 ArrayList<Integer> numbers= new ArrayList<>();
		 numbers.add(1);
		 numbers.add(2);
		 numbers.add(3);
		 numbers.add(4);
		 numbers.add(5);
		 numbers.add(6);
		 numbers.add(7);
		 numbers.add(8);
		 numbers.add(9);
		 numbers.add(10);
		 
		 numbers.forEach(t->System.out.println(t));
	 }
 }