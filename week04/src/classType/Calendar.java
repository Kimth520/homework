package classType;

public class Calendar {
	// 필드
	String color;
	int months;

	// 생성자
	public Calendar(String color, int month) {
		this.color = color;
		this.months = months;
	}
	//메서드
	void info() {
		System.out.println(color + "달력은" + months + "월까지 있습니다.");
	}
	
		
	void hanging() {
		System.out.println(color + "달력을 벽에 걸 수 있습니다");
	}
	
}
