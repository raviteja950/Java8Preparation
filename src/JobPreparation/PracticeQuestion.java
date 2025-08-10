package JobPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import JobPreparation.Bean.Employee;

public class PracticeQuestion {

	public static void main(String[] args) {

		Stream<Integer> IntegerDataSource = Stream.of(1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 13);

		Stream<Integer> Integer1DataSource = Stream.of(1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 13);

		Stream<String> StringDataSource = Stream.of("ARavi", "teja", "ARam", "Raki");

		Stream<String> String1DataSource = Stream.of("ARavi", "tej", "Ram", "Raki");

		Stream<String> String2DataSource = Stream.of("ARavi", "", "", "Raki");

		// Filter even numbers from a list
		// IntegerDataSource.filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + "
		// "));

		System.out.println();

		// Filter names starting with 'A'
		StringDataSource.filter(name -> name.startsWith("A")).forEach(name -> System.out.print(name + " "));

		System.out.println();

		// Filter numbers greater than 10
		Integer1DataSource.filter(number -> number > 10).forEach(num -> System.out.print(num + " "));

		System.out.println();

		// Filter strings of length > 4
		String1DataSource.filter(name -> name.length() >= 4).forEach(name -> System.out.print(name + " "));

		System.out.println();

		// Filter null or empty strings
		String2DataSource.filter(name -> !name.isEmpty() || !name.equals(null))
				.forEach(name -> System.out.print(name + " "));

		System.out.println();

		// Filter employees with salary > 50000
		Employee shiv = new Employee("shiv", "Hyderabad", 50000);
		Employee ram = new Employee("Ram", "Hyderabad", 40000);
		Employee laksh = new Employee("laksh", "Hyderabad", 35000);

		List<Employee> EmployeeList = new ArrayList<>();
		EmployeeList.add(laksh);
		EmployeeList.add(ram);
		EmployeeList.add(shiv);

//		EmployeeList.stream().filter(emp -> emp.getSalary() > 35000)
//				.forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));

		// Filter numbers divisible by 3 and 5
		IntegerDataSource.filter(n -> n % 3 == 0 || n % 5 == 0).forEach(n -> System.out.print(n));

		System.out.println();

		// Filter only palindrome strings
		Stream<String> palendromstring = Stream.of("Ravi", "madam", "rar");
		palendromstring.filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
				.forEach(s -> System.out.print(s + " "));
		;

		System.out.println();

		// Filter names not containing a vowel
		Stream<String> vowelsString = Stream.of("bcdr", "mAdAm", "rar");
		vowelsString.filter(s -> !s.matches(".*[aeiouAEIOU].*"))
				.forEach(s -> System.out.print(s + " :Belongs to vowles "));
		
		System.out.println();
		
		// Filter words ending with 'ing
		Stream<String> words= Stream.of("traveling","raning","rain");
		words.filter(w -> w.endsWith("ing")).forEach(w -> System.out.print(w +" "));
		
		System.out.println();
		
		// Filter employees by name starting with A and salary > 60k
		EmployeeList.stream()
		 .filter(emp -> emp.getName().startsWith("R") && emp.getSalary() >= 40000)
		 .forEach(emp -> System.out.print(emp.getName()+" "));
	}

}
