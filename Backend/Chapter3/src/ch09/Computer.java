package ch09;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	void turnOn() {
		System.out.println("���� ON");
	}
	
	void turnOff() {
		System.out.println("���� OFF");
	}

}
