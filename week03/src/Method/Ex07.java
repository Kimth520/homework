package Method;

public class Ex07 {
	public static void main(String[] args) {
		
		//예제 8-15
		int[] nums = {500, 200};//배열 생성
		Calc calc = new Calc();//객체 생성
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");//calc 인스턴스의 sum메서드를 호출하여 return된 결과값 출력
	}
}
