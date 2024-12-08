package constructor;

public class EX09_02 {
	public static void main(String[] args) {
//		Snack chip = new Snack(); //객체 생성 및 초기화
		//예제 9-4
		Snack chip = new Snack(5000); //객체 생성 및 초기화
//		chip.price = 2000;//객체 필드 설정
		chip.info();//객체 메서드 호출
	}
}
