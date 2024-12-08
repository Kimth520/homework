package exClass;

public class Ex07_13 {//클래스 선언
	public static void main(String[] args) {
		System.out.println(Student.schoolName);
		Student.goToSchool();
		
		
		//예제 7-15
		Student stu1 = new Student();//객체 선언
		//객체명으로 필드 호출
		stu1.studentName = "김고이";
		stu1.hello();
		//정적으로 필드와 메서드 호출
		System.out.println("학교는 " + Student.schoolName);
		Student.goToSchool();
		
		Student stu2 = new Student();
		stu1.studentName = "김고삼";
		stu1.hello();
		System.out.println("학교는 " + Student.schoolName);
		Student.goToSchool();
		
	}

}
