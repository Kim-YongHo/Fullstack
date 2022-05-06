package ch06;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("������ ������");
	}
}

class Human extends Animal {

	@Override
	public void move() {
	
		System.out.println("����� �ι߷� ����");
	}
	
	public void readBook() {
		
		System.out.println("����� å�� ����");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
	
		System.out.println("ȣ���̴� �׹߷� ����");
	}
	
	public void hunting() {
		
		System.out.println("ȣ���̴� ����� ��");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
	
		System.out.println("�������� �ϴ��� ����");
	}
	
	public void flying() {
		
		System.out.println("�������� �糯���� ���ƴٴ�");
	}

}


public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		
		System.out.println("======================================");
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
	
		for(Animal animal : animalList) {
			
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		
		animal.move();
	}
}
