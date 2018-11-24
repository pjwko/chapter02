package chapter2;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setAge(-10);
		// private은 외부에서 접근 불가
		// c.name = "둘리";
		c.setName("둘리");

		System.out.println(c.getName());
	}

}
