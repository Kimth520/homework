package practice;

public class Practice03 {
	public static void main(String[] args) {
		//예제 2-21
		int num1 = 11;
		double num2 = 3.14;
		double num1Change = (double)num1;//int형 정수를 실수형으로 형변환
		
		System.out.println("num1 : "+ num1);
		System.out.println("num1Change : " + num1Change);
		System.out.println(num1Change + num2);//정수형 + 실수형 = 실수형
		System.out.println((int)1.23);//실수형을 정수형으로 형변환
		
		//예제 2-22
		int i1 = 10;
		byte b1 = (byte)i1;//int를 byte로 변환
		System.out.println(b1);
		
		int i2 = 128;
		byte b2 = (byte)i2;//byte의 최대 범위 127을 넘어섰기떄문에 다시 -128이 됨
		System.out.println(b2);
		
		//예제 2-23
		double d1 = 1.0e100;//1.0 x 10의 100승
		float f1 = (float)d1;//float의 최대 범위를 넘음
		System.out.println(f1);
		
		double d2 = 1.0e-100;//1.0 x 10의 -100승
		float f2 = (float)d2;//float의 최소 범위를 넘음
		System.out.println(f2);
		
		//예제 2-24
		double pie = 3.14;
		int pieInt = (int)pie;//실수형 -> 정수형
		System.out.println(pieInt);
		
		int num = 100;
		double numD = (double)num;//정수형 -> double 실수형(범위 내)
		float numF = (float)100;//정수형 -> float 실수형(범위 내)
		System.out.println(numD);
		System.out.println(numF);
		
		int i = 99999999;
		float f = (float) i;//정수형 -> 실수형(범위 밖)
		System.out.println(f);
		
		//예제 2-25
		int num3 = 14;//변수 선언 및 초기화
		double num4 = 3.14;
		
		int num5 = (int) num4;//double형을 int로 형변환
		System.out.println(num5);
		
		//예제 2-26
		int i0 = 100;//변수 선언 및 초기화
		char c = 'a';
		int j = c; //char형에서 int형으로 자동 변환
		double d = i0;//int형에서 double형으로 자동 변환
				
		System.out.println("int형 변수 j의 값 : " + j);
		System.out.println("double형 변수 d의 값 : " + d);
		
		//예제 2-27
		int i3 = 10;
		byte b = (byte)i3;//int형에서 byte형으로 강제 형변환(값이 작을 경우)
		System.out.println("[int ->byte] i3의 값 : " + i3 + "b의 값 : " + b);
		
		int j1 = 1000;
		byte c0 = (byte) j1;//int형에서 byte형으로 강제 형변환(값이 큰 경우)
		System.out.println("[int ->byte] j1의 값 : " + j1 + "c0의 값 : " + c0);
		
	}
}
