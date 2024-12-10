package inhertance;

public class Customer extends Person{//자식 클래스 선언
	//필드
	int memberId;

	
	//생성자
	public Customer(String name, int age, int memberId) {
		super(name, age);//super 메서드를 통해서 부모 생성자에 매개변수 전달
						//부모 객체 생성!
		this.memberId = memberId;
	}
	//메소드
	void enter() {
		System.out.println("회원번호 : " + memberId + " (" + name + ", " +age + " 세) 님이 입장하셨습니다.");
	//name 과 age는 Person으로부터 상속받은 필드
			
	}
}
