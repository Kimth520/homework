package practice;

public class Practice01 {//클래스 중괄호 시작영역
	public static void main(String[] args) {//main 메소드의 중괄호 시작영역
		System.out.println("Hello JAVA");//Hello JAVA라는 값을 콘솔창에 출력하고 줄바꿈한다
		
		//예제 2-1
		System.out.print("Welcome");//괄호안의 데이터를 콘솔창에 출력
		System.out.print("JAVA World");//Welcome 문자열 옆에 JAVA World 문자열 출력
		
		//예제 2-2
		System.out.println("Welcome");//괄호안의 데이터를 콘솔창에 출력
		System.out.println("JAVA World");//Welcome 문자열 아래 JAVA World 문자열 출력
		
		//예제 2-3
		System.out.printf("저는 대학교 %d학년에 재학중입니다!",3);//정수형 서식문자를 사용하여 출력
		
		//예제 2-4
		System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세번째.", 1, 2.0, "셋");
		//정수형 실수형 문자열 서식문자를 사용하여 출력
		
		//예제2-5
		System.out.printf("%5d", 1);//5칸 만큼 확보한 후 오른쪽 정렬해서 1출력
		System.out.println();
		System.out.printf("%5d", 12);//5칸 만큼 확보한 후 오른쪽 정렬해서 12출력
		System.out.println();
		System.out.printf("%5d", 123);//5칸 만큼 확보한 후 오른쪽 정렬해서 123출력
		System.out.println();
		System.out.printf("%5d", 1234);//5칸 만큼 확보한 후 오른쪽 정렬해서 1234출력
		System.out.println();
		System.out.printf("%5d", 12345);//5칸 만큼 확보한 후 오른쪽 정렬해서 12345출력
		System.out.println();
		
		//예제 2-6
		System.out.printf("%.1f", 1.1234567);//반올림하여 소수점 아래 1번째 까지 출력
		System.out.println();
		System.out.printf("%.2f", 1.1234567);//반올림하여 소수점 아래 2번째 까지 출력
		System.out.println();
		System.out.printf("%.3f", 1.1234567);//반올림하여 소수점 아래 3번째 까지 출력
		System.out.println();
		System.out.printf("%.4f", 1.1234567);//반올림하여 소수점 아래 4번째 까지 출력
		System.out.println();
		System.out.printf("%.5f", 1.1234567);//반올림하여 소수점 아래 5번째 까지 출력
				
		//예제 2-7
		int studentAge;//학생의 나이를 저장할 수 있는 변수 선언
		studentAge = 20;//변수에 값을 대입(저장)
		System.out.println(studentAge);//출력
		
		//예제 2-8
		String myCity = "Seoul";// 도시를 저장할 수 있는 변수 선언, 변수에 Seoul 대입
		System.out.println("I am from" + myCity);//출력
		
		//예제 2-9
		int myAge = 20;//정수를 담을 수 있는 변수 myAg에 20을 저장
		int yourAge = myAge;//myAge의 20이 복사되어 yourAge에 저장 
		System.out.println();
		
		//예제 2-10
		int myAge1 = 20;
		int yourAge1 = 30;
		int tempAge;
		
		tempAge = myAge1;//myAge에서 저장된 데이터를 tempAge에 복사
		myAge1 = yourAge1;//myAge에 yourAge의 데이터를 복사
		yourAge1 = tempAge;//tempAge에 저장해둔 myAge데이터를 yourAge에 저장
	
		
		
	}//main 메소드의 중괄호 끝 영역
}//클래스 중괄호 끝 영역
