package JobPreparation;

import java.util.stream.Stream;

public class lesson6 {

	
	//takeWhile stream state full intermediate operator
	public static void main(String[] args) {
		
		
		
		Stream.of(1,2,3,4,5,6,7,8)
		.takeWhile(num -> num <=5)
		.forEach(n -> System.out.println(n));
		
		
		Stream.of("ram","rak","reash","ramesh","ra")
		.takeWhile( w -> w.length()>2)
		.forEach(w ->System.out.print(w+" "));
		
		
		System.out.println();
		
		Stream.of("ram","rak","reash","ramesh","ra","ram","rak")
		.skip(2)
		.forEach(w -> System.out.print(w+" "));
		
		System.out.println();
		
		Stream.of("ram","rak","reash","ramesh","ra","ram","rak")
		.distinct()
		.forEach(w -> System.out.print(w+" "));

	}

}
