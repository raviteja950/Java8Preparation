package JobPreparation.Bean;

public class Student {

	private String name;
	private String city;
	private long number;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, String city, long number, int age) {
		super();
		this.name = name;
		this.city = city;
		this.number = number;
		this.age = age;
	}

}
