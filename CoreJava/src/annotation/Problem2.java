package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD })
@interface info {
	int authorID();

	String author() default "Null";

	String supervisor() default "Null";

	String date();

	String time();

	int version();

	String description() default "General class";
}

@info(authorID = 1, date = "22 June", time = "7pm", version = 4)
public class Problem2 {

}