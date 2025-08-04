package JobPreparation;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

//in this we will learn about Stream api forEach and generate method

public class Lesson1 {
	public static void main(String[] args) {
		
		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {

				return "Hello Ravi";
			}
		};
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("printing String : - " + t);

			}
		};
		Stream<String> streamOfString = Stream.generate(supplier);	
		//genearte method will take input as Supplier 
		//generate method will return infinite loop string

		
		
		streamOfString.forEach(consumer);	
		//forEach method will take input as consumer

	}

}
