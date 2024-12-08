package method;

public class Person {
	//예제 8-10
	void introduce(String name, int age) {//선언부 리턴값 없고 매개변수 문자열 하나정수형 하나
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");//출력
	}
	
	void hello() {//선언부 리턴값과 매개변수 둘다 없음
		System.out.println("안녕하세요.");//출력
	}
}
