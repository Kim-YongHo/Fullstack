package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "James";
		p.age = 37;
		
		System.out.println(p.name);
		
		Person p2 = p.getPerson();
		
		p2.name = "Jim";
		System.out.println(p2.name);
		System.out.println(p.name);
		
		Person p3 = new Person();
		p3.name = "James";
		p3.age = 37;
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		
		
		Person test = new Person();
		System.out.println(test.name);
		System.out.println(test.age);
		
	}
}

