package JobPreparation;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

///print the elements which are greater than 5
public class Lession4 {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// traditional way
//		for (int number : data) {
//			if (number > 5) {
//				System.out.println(number);
//			}
//		}

		// stream API
		// first we need to set source of data
//		IntStream StreamOfInteger = Arrays.stream(data);
//		IntStream filterStreamOfInetger = StreamOfInteger.filter(new IntPredicate() {
//			@Override
//			public boolean test(int value) {
//				return value > 5;
//			}
//		});
//		filterStreamOfInetger.forEach(number -> System.out.print(number + " "));

		Arrays.stream(data).filter(value -> value > 5).forEach(number -> System.out.print(number + " "));
	}

}
