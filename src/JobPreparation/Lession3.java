package JobPreparation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import JobPreparation.Bean.Student;

public class Lession3 {

	public static void main(String[] args) {

		Student rakesh = new Student("Rakesh","Hyd",12345, 22);
		Student ravi = new Student("Ravi","Hyd",123458, 22);
		Student rahul = new Student("Rahul","Hyd",123457, 22);
		

		List<Student> studentList = Arrays.asList(rakesh, ravi, rahul);

		System.out.println("-----traditional way to loop each and every student------");
		System.out.println();
		for (Student studentData : studentList) {
			System.out.println(studentData);
		}
		System.out.println();
		System.out.println("----using strem api------");
		System.out.println();
		studentList.stream().forEach(stu -> System.out.println(stu));
		

	}

}
