package JobPreparation;

import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class lesson5 {

	public static void main(String[] args) {

		System.out.println("using stream -of- method");
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
		.sorted(Comparator.reverseOrder())
		.forEach(n -> System.out.print(n+" "));

		
		System.out.println();
		System.out.println("Using stream -iterate- method");
		Stream.iterate(0, new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer number) {
				// TODO Auto-generated method stub
				return number + 1;
			}
		})
		.limit(5)
		.sorted(Comparator.reverseOrder())
		.forEach(n -> System.out.print(n+"  "));
	}

}
