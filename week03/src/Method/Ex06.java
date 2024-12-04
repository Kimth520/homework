package Method;

public class Ex06 {
	//예제 8-13
	public static void main(String[] args) {
		int nums[] = {100,200};//배열 선언
		Calc calc = new Calc();//객체 생성
		calc.sum(nums);//calc 인스턴스에서 sum 메서드 호출
	}
}
