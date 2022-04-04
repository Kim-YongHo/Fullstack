package ch05;

public class StudnetTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
		
		

	}

}
