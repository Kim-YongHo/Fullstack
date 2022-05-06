package ch03;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.showCustomerInfo());
		
		
		Customer customerKim = new VIPCustomer(10020, "김유신");
		System.out.println(customerKim.showCustomerInfo());
		
		
	}

}
