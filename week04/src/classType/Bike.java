package classType;

public class Bike {
	//필드
	String riderName;
	int wheel = 2;
	public Bike(String riderName) {
		this.riderName = riderName;
	}
	
	void info() {
		System.out.println(riderName + "의 자전가는 " + wheel + "발 자전거 입니다");
	}
	
	void ride() {
		System.out.println("씽씽");
	}
	
}
