package Method;

public class Calc {
	//예제 8-8
//	void sum(int num1, int num2) {//선언부 리턴값 없고 매개변수 정수형 두개
//		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");//실행부 출력
//	}
	
	//예제 8-12
//	void sum(int[] nums) {//선언부 리턴값 없고 매개변수 정수형 배열
//		int result = 0;//총합 구할 변수 선언
//		for(int i = 0; i<nums.length; i++) {//배열의 길이만큼 반복
//			result += nums[i];//변수에 배열값들의 합 합산
//			
//		}
//		System.out.println("숫자들의 합은" + result + "입니다");
//	}
	
	//예제 8-14
	public int sum(int[] nums) {//위와 동일
		int result = 0;
		for(int i = 0; i<nums.length ; i++) {
			result += nums[i];
		}
		return result;//매개변수로 받은 값을 모두 더한 result 값을 다시 반환
	  }
	}
	
	
	

