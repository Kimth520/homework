package exception;

public class EX14_04 {
	public static void main(String[] args) {
		int result = 0;
		
		try {//예외 발생 가능성이 있는 코드 위치
			result = 10/0;//0으로 나눌 수 없음
			System.out.println("나누기 결과" + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 할 수 없습니다");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
