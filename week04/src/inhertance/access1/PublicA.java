package inhertance.access1;

public class PublicA {//클래스 선언
	//필드
	public int a;
	
	//생성자
//	public PublicA(int a) {
//		this.a = a;
//	}
	
	private PublicA(int a) {//private으로
		super();
		this.a = a;
	}

	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메서드입니다.");
	}
	
	DefaultC dc = new DefaultC();//같은 패키지이기 떄문에 객체 생성 가능
	void methodA(){
		dc.variableC = 20;//public으로 선언된 필드로 객체를 통해 접근 가능
	}
	
}
