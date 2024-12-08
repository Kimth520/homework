package constructor;

public class Phone {//클래스 선언
	String brand;
	int series;
	String color = "검정색"; //필드 기본값 초기화
	
	public Phone(String b, int s, String c) {//생성자 생성
		brand = b;
		series = s;
		color = c;
	}
	
	
	//예제 9-9
	public Phone(String b, int s) {//매개변수 2개 받는 생성자
		brand = b;
		series = s;
	}



	void phoneInfo() {//메서드 생성
		System.out.println(color + " " + brand + " " + series);
	}
	
}
