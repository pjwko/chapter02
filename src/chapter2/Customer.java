package chapter2;

public class Customer {
	protected String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	
}
