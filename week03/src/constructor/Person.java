package constructor;

public class Person {//클래스 선언
	String name;
	int age;
	public Person(String n, int a) {//직접 생성한 생성자
		name = n;//매개변수로 받은 값을 필드 name과  age에 대입
		age = a;
	}
	
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + age + "세 " + name + "입니다.");
	}
	

}
