package JobPreparation;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Lession2 {

	public static void main(String[] args) {

		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");

			}
		};
		;

		Stream<Integer> streamOfInteger = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// stream.of help us to create a stream of data with out infinite loop
		// were as stream.generate will process infinite loop

		streamOfInteger.forEach(consumer);
		
		

	}

}
