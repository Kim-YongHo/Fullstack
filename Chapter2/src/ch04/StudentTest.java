package ch04;

public class StudentTest {

	public static void main(String[] args) {
	
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울시 강남구";
		
		studentLee.showStudentInfo();
		
		
		Student studentBaek = new Student(); //생성자
		
		studentBaek.studentID = 54321;
		studentBaek.studentName = "Baek";
		studentBaek.address = "서울시 마포구";
		
		studentBaek.showStudentInfo();
		
		//주소값 확인
		System.out.println(studentLee);
		System.out.println(studentBaek);
		
	}

}
