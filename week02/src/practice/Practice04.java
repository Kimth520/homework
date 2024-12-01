package practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		//예제 2-28
		//double형에서 float형 강제 형변환(float형 범위 내 값)
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.println("[double -> float]의 d1의 값 :" + d1 + "f1의 값 :" + f1);
		//double형에서 float형 강제 형변환(float형 최소값보다 작은 경우)
		double d2 = 1.0e-50;
		float f2 = (float)d2;
		System.out.println("[double -> float]의 d2의 값 :" + d2 + "f2의 값 :" + f2);
		//double형에서 float형 강제 형변환(float형 최대값보다 큰 경우)
		double d3 = 1.0e100;
		float f3 = (float)d3;
		System.out.println("[double -> float]의 d3의 값 :" + d3 + "f1의 값 :" + f3);
		//double형에서 float형 정밀도 차이
		double d4 = 9.123456789;
		float f4 = (float)d4;
		System.out.println("[정밀도 차이]의 d4의 값 :" + d4 + "f4의 값 :" + f4);
		
		//예제 2-29
		float f5 = 12345.67f;
		int i5 = (int)f5; //float형에서 int형 강제 형변환
		System.out.println("[float->int]f5의 값 :" +f5 + "i5의 값 :" +i5);
		
		double d5 = 12345.678;
		int i6 = (int) d5;//double형에서 int형 강제 형변환
		System.out.println("[double->int]d5의 값 :" +d5 + "i6의 값 :" +i6);
		
		//예제 2-30
		Scanner sc = new Scanner(System.in);//입력클래스 import
		System.out.println("나이를 입력해 주세요.");//입력 메시지 출력
		int age = sc.nextInt();//입력 메소드
		System.out.printf("내 나이는 %d세 입니다", age);//출력
		
		//예제 2-31
		//입력클래스 import
		//변수 선언
		String name, address;
		int age1;
		double weight;
		//출력 메시지
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요");
		//입력 메소드
		name = sc.next();
		address = sc.next();
		age1 = sc.nextInt();
		weight = sc.nextDouble();
		//출력문
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 주소는 %s입니다.\n", address);
		System.out.printf("당신의 나이는 %d입니다.\n", age1);
		System.out.printf("당신의 체중은 %.1fkg입니다.\n", weight);
		
	}
}
