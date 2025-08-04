package JobPreparation;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaLession1 {

	public static void main(String[] args) {

//		Supplier<String> supplier = new Supplier<String>() {
//
//			@Override
//			public String get() {
//				// TODO Auto-generated method stub
//				return "Hello ravi";
//			}
//		};

//		Consumer<String> consumer = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//
//			}
//		};

//		Stream<String> streamOfString = Stream.generate(() -> "Hello ravi");
//		streamOfString.forEach(t -> System.out.println(t));

		Stream.generate(() -> "Hello ravi").forEach(t -> System.out.println(t));

	}

}
