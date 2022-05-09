package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
	
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerP = new GoldCustomer(10040, "Percy");
		Customer customerK = new VIPCustomer(10050, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			
			int cost = customer.calPrice(price);
			System.out.println("===========================");
			System.out.println("고객명 : " + customer.getCustomerName());
			System.out.println("지불 가격 : " + cost);
			System.out.println("남은 포인트 : " + customer.bonusPoint);
		}
		
		
		
	}
	
}
