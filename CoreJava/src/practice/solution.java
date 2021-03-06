package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 23),
				new Person("Lewis", "Carell", 15),
				new Person("Thomas", "Calyle", 45),
				new Person("Matthew", "Bronte", 42),
				new Person("Charlote", "Arnold", 39));

		Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		System.out.println("printing all persons");
		printConditionally(people,p->true,p->System.out.println(p));
		
		System.out.println("starting last name from c");
		printConditionally(people , p->p.getLastName().startsWith("C"),p->System.out.println(p));
		
		System.out.println("starting first name with c");
		printConditionally(people, p->p.getFirstName().startsWith("C"),p->System.out.println(p.getFirstName()));


	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p:people ) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}

}

