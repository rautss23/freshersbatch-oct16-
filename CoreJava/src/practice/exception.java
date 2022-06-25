package practice;

import java.util.function.BiConsumer;

public class exception {

	public static void main(String[] args) {
		int []myArray= {1,2,3,4,5};
		int key=0;
		
		process(myArray,key,(v,k)->{
			try {
			System.out.println(v/k);
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			
		});

	}

	private static void process(int[] myArray, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i:myArray) {
			consumer.accept(i, key);
		}
		
	}

}
