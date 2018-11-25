package chapter2;

public class Student extends Person {
	public Student() {
		// 자식생성자에서 부모생성자를 지정하지
		// 않으면 기본적으로 부모의 기본생성자가
		// 먼저 호출된다.
		// super();
		System.out.println("Student() called");
	}
}
