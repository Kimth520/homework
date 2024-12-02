package practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		//예제 4-1
		int result = 0;//변수 선언 및 초기화
		if(3>2) {//만약 3이 2보다 크면
			result = 3;//결과값 3을 변수에 대입
		}
		System.out.println(result);
		
		
		//예제 4-2
		Scanner sc = new Scanner(System.in);//입력 클래스 import
		System.out.println("나이를 입력하세요");//입력 메시지 
		
		int age = sc.nextInt();//입력 메소드 
		if(age>19) {//만약 입력한 값이 19 이상이라면
			System.out.println("성인입니다.");//성인입니다 출력
		}
		System.out.println("프로그램을 종료합니다.");//if문 끝나고 종료 메시지 출력
		
		//예제 4-3
		int num = 5;//변수 선언 및 초기화
		
		if(num>4) {//num이 4보다 크면 
			System.out.println(num + "은 4보다 큽니다.");
		}else {//아니라면
			System.out.println(num + "은 4보다 작습니다.");
		}
		
		//예제 4-4
		int a = 4;//변수 선언
		int b = 10;
		
		if(a>b) {//a가 b보다 크면 아래 출력
			System.out.println("a가 b보다 크다");
		}else {//아니면 아래 출력
			System.out.println("a가 b보다 작거나 같다");
		}
		
		//예제 4-5
		int a1=4; //변수 선언
		int b1 = 10;
		int max = 0;
		
		if(a>b) {//a가 b보다 크면
			max = a1;//max에 a1값 대입
		}else {//아니면
			max = b1;//max에 b1값 대입
		}
		System.out.println(a+"와(과)" + b+ "중에 큰 수는 " + max + "입니다");
		
		//예제 4-6
		//입력 클래스 import
		System.out.println("나이를 입력하세요.");//입력 메시지 출력
		
		int age1 = sc.nextInt();//입력 메소드
		if (age1>19) {//입력받은 값이 19 보다 크면 아래 출력
			System.out.println("성인입니다");
		}else {//아니면 아래 출력
			System.out.println("미성년자입니다");
		}
		
		
		//예제 4-7
		int favorite = 7;//변수 선언
//		if(favorite < 5) {//변수값이 5보다 작으면 아래 출력
//			System.out.println("좋아하는 숫자가 5보다 작습니다.");
//		}else if(favorite >5) {//변수값이 5보다 크다면 아래 출력
//			System.out.println("좋아하는 숫자는 5보다 큽니다");
//		}else {//그 이외는 아래 출력
//			System.out.println("좋아하는 숫자가 5입니다");
		
		
		//예제 4-8
		//예제 4-7과 비교
		if(favorite > 5) {//변수값이 5보다 크면 아래 출력
			System.out.println("좋아하는 숫자가 5보다 큽니다.");// true이기 때문에 출력 후 종료
		}else if(favorite == 7) {//변수값이 7이면 아래 출력
			System.out.println("좋아하는 숫자는 5보다 큽니다");//더 정확한 구문이지만 앞에서 종료되어 실행 안됨
		}	
		
		//예제 4-9
		//입력 클래스 import
		System.out.println("나이를 입력하세요");//입력 메시지
		int age2 = sc.nextInt();//입력 메소드
		if(age2 > 19) {//입력 받은 나이가 19살보다 크면
			System.out.println("성인입니다");
		}else if(age2 > 13) {//19살보다 크지 않지만 13살 보다 크면
			System.out.println("청소년입니다");
		}else if(age2 > 6) {//13살 보다 크지 않지만 6살보다 크면
			System.out.println("어린이입니다");
		}else {//그 외 나머지(6살부터 그 아래)
			System.out.println("유아입니다");
		}
			
		//예제 4-10
		int num1 = 7;//정수형 변수 선언
		switch(num1) {
			case 1 ://num의 값이 1이면
				System.out.println("num은 1입니다");
			break;
			
			case 7 ://num의 값이 7이면
				System.out.println("num은 7입니다");
				break;
			default ://모두 만족하지 않다면
				System.out.println("num은 1도 7도 아닙니다");
			
		}
		
		//예제 4-11
		int num2 = 7;//정수형 변수 선언
		//break 없을때
		switch(num2) {
		case 1 ://num의 값이 1이면
			System.out.println("num은 1입니다");
			
		case 7 ://num의 값이 7이면
			System.out.println("num은 7입니다");//여기부터 실행해서
			
		default ://모두 만족하지 않다면
			System.out.println("num은 1도 7도 아닙니다");//여기까지 실행(break문 없어서)
		}
		
		
		//예제 4-12
		//입력 클래스 import
		System.out.println("원하는 숫자를 입력하세요. (1~5)");//입력 메시지 출력
		
		int num3 = sc.nextInt();//입력메소드 선언
		switch(num3) {//switch문(변수)
		case 5://입력한 숫자가 5라면 아래 출력
			System.out.println("5를 입력하셨습니다");
			break;//조건의 구문을 마치고 switch문을 완전히 빠져나가는 역할
		case 4://입력한 숫자가 4라면 아래 출력
			System.out.println("4를 입력하셨습니다");
			break;
		case 3://입력한 숫자가 3라면 아래 출력
			System.out.println("3을 입력하셨습니다");
			break;
		case 2://입력한 숫자가 2라면 아래 출력
			System.out.println("2를 입력하셨습니다");
			break;
		case 1://입력한 숫자가 1라면 아래 출력
			System.out.println("1을 입력하셨습니다");
			break;
		default://그 외의 숫자를 입력하였다면
			System.out.println("1~5까지의 숫자를 입력하세요");
			
		}
		
		
		
	}
}
