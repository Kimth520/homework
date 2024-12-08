package method;

public class Ex09 {
	//예제 8-19
	public static void main(String[] args) {
		int money = 10000;//변수 선언
		
		Bus bus = new Bus();//객체 생성
		bus.take(money);//bus 인스턴스의 take 메서드 호출
	}
}
