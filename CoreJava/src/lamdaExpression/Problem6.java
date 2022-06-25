package lamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Problem6 {

	public static void main(String[] args) {
		List<String> join = new ArrayList<>();

		join.add("hello");
		join.add("world");
		join.add("this");
		join.add("is");
		join.add("lamda");
		join.add("problem");
		join.add("assignment");

		join.replaceAll(new change());
		join.stream().collect(Collectors.toList()).forEach(System.out::println);

	}

}

class change implements UnaryOperator<String> {
	@Override
	public String apply(String s) {
		return s.toUpperCase();
	}
}
