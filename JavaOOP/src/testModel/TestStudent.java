package testModel;

import model.Student;

public class TestStudent {
	public static void main(String[] args) {
		Student student = new Student("Dong","Zhu", 20, 0, "123456");
		System.out.println(student.toString());
	}
}
