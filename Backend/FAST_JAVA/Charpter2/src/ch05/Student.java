package ch05;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} //deafult 생성자
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName =studentName;
		this.grade = grade;
		
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 법은" +
				studentNumber + "이고, " +
				grade + "학년 입니다.";
	}
}
