package practice;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("Charles", "Dickens", 23),
				new Person("Lewis", "Carell", 15),
				new Person("Thomas", "Calyle", 45),
				new Person("Matthew", "Bronte", 42),
				new Person("Charlote", "Arnold", 39)
				);
people.stream()
.filter(p->p.getLastName().startsWith("C"))
.forEach(p->System.out.println(p.getFirstName()));
	}

}
