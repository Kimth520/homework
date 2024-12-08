package constructor;

public class EX09_08 {//클래스 선언
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 1, "흰색");//객체 생성 및 매개변수 대입
//		Phone p2 = new Phone("아이폰", 2);//컴파일 오류
		
		//예제9-10
		Phone p2 = new Phone("아이폰", 2);//컴파일 오류 해결
		
		p1.phoneInfo();
		p2.phoneInfo();
		
	}

}
