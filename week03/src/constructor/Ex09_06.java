package constructor;

public class Ex09_06 {
	public static void main(String[] args) {
		Person p1 = new Person("김자바", 20);//객체 생성 및 매개변수 대입
		Person p2 = new Person("이코딩", 40);
		
		p1.introduce();
		p2.introduce();
	}
}
