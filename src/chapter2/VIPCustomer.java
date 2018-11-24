package chapter2;

public class VIPCustomer extends Customer {
	public void showInfo() {
		//System.out.println(age);
		// protected는 자식에서 접근이 가능하다.
		System.out.println(name);
	}
}
