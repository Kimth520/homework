package constructor;

public class Snack {//클래스 선언
	int price;//인스턴스 필드 선언
	
	
	
	public Snack(int p) {//직접 선언한 생성자
	price = p;//매개변수로 받은 값을 필드 price에 대입
}



	void info() {//메소드 선언
		System.out.println("과자의 가격은" + price+ "원입니다");
	}

}
