package ch10;

public class AICar extends Car {

	@Override
	public void drive() {

		System.out.println("자율주행을 함");
		System.out.println("자동차가 스스로 방향을 바꿈");

	}

	@Override
	public void stop() {
 
		System.out.println("장애물 앞에서 멈춤");
	}
	

}
