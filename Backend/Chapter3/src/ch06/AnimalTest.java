package ch06;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직임");
	}
}

class Human extends Animal {

	@Override
	public void move() {
	
		System.out.println("사람은 두발로 걸음");
	}
	
	public void readBook() {
		
		System.out.println("사람은 책을 읽음");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
	
		System.out.println("호랑이는 네발로 걸음");
	}
	
	public void hunting() {
		
		System.out.println("호랑이는 사냥을 함");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
	
		System.out.println("독수리는 하늘을 날음");
	}
	
	public void flying() {
		
		System.out.println("독수리는 양날개로 날아다님");
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
