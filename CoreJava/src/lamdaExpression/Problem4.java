package lamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Problem4 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();

		words.add("hello");
		words.add("world");
		words.add("this");
		words.add("is");
		words.add("lamda");
		words.add("problem");
		words.add("assignment");

		Predicate<String> length = (c) -> {
			if (c.length() % 2 == 0) {
				return true;
			} else
				return false;
		};
		words.stream().filter(length).collect(Collectors.toList()).forEach(System.out::println);

	}

}
