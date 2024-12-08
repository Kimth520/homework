package exClass;

public class Ex07_06 {
	public static void main(String[] args) {
		Car c = new Car();//클래스를 이용해서 객체 생성
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다");
		
		c.wheel = 5;//c 객체의 데이터인 wheel 값을 5로 변경
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다");
		
		//예제 7-9
		c.ride();//메서드 사용
		c.ride();//메서드 사용
		c.ride();//메서드 사용
	}
}
