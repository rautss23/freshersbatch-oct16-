package lamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

	public static void main(String[] args) {
		StringBuilder build =new StringBuilder();
		List<String> join =new ArrayList<>();
		
		join.add("hello");
		join.add("world");
		join.add("this");
		join.add("is");
		join.add("lamda");
		join.add("problem");
		join.add("assignment");

		join.forEach(t->build.append(t.charAt(0)));
		System.out.println("the resultant string using string builder is:");
		System.out.println(build);
	}

}
