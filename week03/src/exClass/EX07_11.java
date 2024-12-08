package exClass;

public class EX07_11 {//클래스 선언
	public static void main(String[] args) {
		Family father = new Family();//객체 선언
		Family son = new Family();//다른 댇체 선언
		
		father.address = "인천";//객체 하나의 주소를 바꿔도
		System.out.println(son.address);//다른 객체는 바뀌지 않음
	}

}
