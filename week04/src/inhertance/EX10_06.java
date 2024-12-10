package inhertance;

public class EX10_06 {
	public static void main(String[] args) {
		 Customer c1 = new Customer("박자바", 25, 11111);//customer 객체 생성/매개변수 대입
		 c1.enter();//객체.메서드
		 
		 Customer c2 = new Customer("송코딩", 25, 11111);
		 c2.enter();
	}
}
