package Method;

public class Ex01 {
	public static void main(String[] args) {
		printHello();//main 메서드 안에서 printHello()메서드 호출
	}
	static void printHello() {//선언부 - 리턴값과 매개변수 없는 메서드 생성
		System.out.println("안녕하세요");//실행 영역
		System.out.println("만나서 반갑습니다");
	}
}
