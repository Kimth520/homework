package practice;

public class Practice05 {
	public static void main(String[] args) {
		//예제 3-1
		int x = 100;
		int resultPlus = +x;//변수 x값에 +
		int resultMinus = -x;//변수 x값에 -
		
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		//예제 3-2
		double d = 1.11;
		double result = -d;//변수 d값에 -한것을 result변수에 저장
				
		System.out.println(-d);//출력
		System.out.println(result);//
		
		//예제 3-3
		int num = 10;//변수 선언
		System.out.println(num);
		num++;//num값에 +1
		System.out.println(num);
		
		//예제 3-4
		int num1 = 10;
		System.out.println(num1++);//num1을 출력한 후에 변수 num1에 +1
		System.out.println(num1);//+1된 값을 출력
		
		//예제 3-5
		int num2 = 30;
		System.out.println(++num2);// 30에 +1하고 출력
		System.out.println(num2);//+1된 값 출력
		
		System.out.println(num2++);//저장된 num2 출력 후 +1
		System.out.println(++num2);//+1된 갑 출력
		
		//예제 3-6
		int x1 = 1;
		System.out.println(x1++);//x1이 먼저 출력 되고 난후 +1
		System.out.println(x1);//+1된 값 출력
		System.out.println(++x1);//+1을 해준후 결과 값 출력
		
		//예제 3-7
		char alphabetX = 'X';//유니코드 정수 88로 저장되어 X와 매팽
		System.out.println(alphabetX++);//alphabetX가 출력된 후 +1
		System.out.println(alphabetX);//89와 매칭된 Y출력
		
		//예제 3-8
		boolean isHuman = false;//논리형 변수에 false 대입
		System.out.println(!isHuman);//부정하면 true
		System.out.println(isHuman);//기본 대입된 false 출력
		
		//예제 3-9
		int y = 100;
		int z = 200;
		
		System.out.println(y+z);//+연산 출력
		System.out.println(y-z);//-연산 출력
		System.out.println(y*z);//곱하기 연산 출력
		System.out.println(y/z);//나눗셈 몫 출력
		System.out.println(y%z);//나눗셈 나머지 출력
		
		//예제 3-10
		double num3 = 1.2345;//실수형 변수 선언 후 초기화
		int num4 = 6;//정수형 변수 선언 후 초기화
		System.out.println(num3 + num4);//num4를 double로 형 변환하여 연산
		
		//예제 3-11
		int result1 = 1000000 * 100000;
		System.out.println(result1);//표현 범위를 넘어서 엉뚱한 값 출력
		
		//
	}
}
