package abst;

public abstract class Receipt {
	String chef;

	//생성자
	public Receipt(String chef) {//추상메서드 아님 but 직접 부모 클래스 객체 생성하지 못함
		this.chef = chef;
	}
	
	void info() {
		System.out.println("이 레시피는 " + chef + "세프님의 레시피입니다.");
	}

	
}
