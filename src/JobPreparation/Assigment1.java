package JobPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import JobPreparation.Bean.Student;

public class Assigment1 {

	public static void main(String[] args) {

		List<Student> studentList = getStudelist();
		List<String> filteredStudent = studentList.stream().filter(stu -> stu.getAge() > 24).map(stu -> stu.getName())
				.limit(2).collect(Collectors.toList());
		
		System.out.println(filteredStudent);
		// .forEach(stu -> System.out.println(stu));
	}

	public static List<Student> getStudelist() {

		List<Student> studentList = new ArrayList<>();

		Student ram = new Student("Ram", "Hyd", 12345, 25);
		Student ramba = new Student("Ramba", "Hyd", 12345567, 26);
		Student mina = new Student("Mina", "Vizag", 1234789, 27);
		Student rani = new Student("Rani", "Vizag", 1234590, 24);

		studentList.add(ram);
		studentList.add(ramba);
		studentList.add(mina);
		studentList.add(rani);

		return studentList;

	}

}
