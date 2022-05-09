package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void starCar() {
		System.out.println("�õ��� �Z�ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() {
		starCar();
		drive();
		stop();
		turnOff();
	}

}
