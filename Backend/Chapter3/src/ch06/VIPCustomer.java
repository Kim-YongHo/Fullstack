package ch06;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private String agentID;
	
	
	//super�� �̿��Ͽ� ���� Ŭ������ ������ ��������� ȣ��
	public VIPCustomer(int customerID, String customerName) {
			super(customerID, customerName);
			
			customerGrade = "VIP";
			bonusRatio = 0.05;
			salesRatio = 0.1;
	
	}
	
	@Override
	public int calPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		
		return price;
	}

	public String getAgentID() {
		return agentID;
	}

	
}