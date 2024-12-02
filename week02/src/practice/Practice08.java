package practice;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		//예제 5-1
		int sum = 0;//변수 선언 및 초기화
		for(int i=1; i<=10; i++) {//for문 1부터 10까지 반복
			sum +=i;//sum = sum+i 실행문
		}
		System.out.println("합 : " + sum);//합 계산 출력문
		
		//예제 5-2
		int sum1 = 0;//합을 저장할 변수
		for(int i= 1; i<=100; i++) {//1부터 100까지 반복문
			if(i%2==0) {//만약 2로 나누어진다면 (짝수)
				sum1 += i; //sum1 = sum1 +i
			}
		}
		System.out.println("합 : " + sum);//합 출력문
		
		//예제 5-3
		for(int i = 2; i<=9; i++) {//2부터 9까지 반복
			for(int j = 1; j<=9; j++) {//각 단에서 곱하기 하는 부분
				System.out.print(i+"X"+j+ "="+ (i*j)+"\t");//각 단과 곱해서 구구단 출력/단 줄바꿈 없음
			}
			System.out.println();//단 끝나면 줄바꿈
		}
		
		
		//예제 5-4
		for(int i = 0; i<7; i++) {//7행까지 반복
			for(int j=0; j<7-i; j++) {//공백이 7에서 부터 하나씩 줄어드므로 7-i
				System.out.println(" ");//공백 출력
			}
			for(int k = 0; k<(2*i)+1; k++){//별이 1부터 홀수로 늘어나므로(2*i)+1
				System.out.println("*");//별 출력
			}
			System.out.println();//줄바꿈		//한줄 끝나면 줄바꿈
		}
		
		//예제 5-5
		int sum2 = 0;//총합 구할 변수 선언
		int i = 1;//시작 변수 선언
		
		while(i<=10) {//()안의 조건식이 참일때까지 반복
			sum2 += i;//sum2 = sum2 + i
			i++;//매번 끝날때 i가 1 증가 한후 반복 
		}
		System.out.println("합 : " + sum2);//합 출력
		
		//예제 5-6
		int sum3 = 0;//총합 구할 변수 선언
		int i2 = 1;//시작할 변수 선언
		
		do {// {} 안의 반복문 무조건 실행
			sum3 +=i2;//sum3 = sum3 + i2
			i2++;//매번 끝날때 i2가 1 증가 한후 반복 
		}while(i2 <=10);//조건식이 참이면 다시  do로 돌아가서 실행 11이 되면 종료
		System.out.println("합 : "+ sum3);//합 출력
		
		//예제 5-7
		int sum4 = 0;//총합 구할 변수 선언
		for(int i4 = 1; i4<= 100; i4++) {//1부터 100까지 반복
			if(i4%2 !=0) {//만약 2로 나눌때 나머지가 0이 아니라면
				continue;//이번 차수를 종료하고 다시 위로 올라가서 다음 반복 진행
			}
			sum4 += i4;//나머지가 0일때의 i4들의 총합
		}
		System.out.println("짝수 합 : " + sum4);//짝수의 총합 
		
		//예제 5-8
		int magicNumber = (int)(Math.random() *50)+1;//매직넘버 변수에 (정수변환한)랜덤값을 부여함
		Scanner sc = new Scanner(System.in);//입력클래스 import
		boolean isMatched = false;//논리형 isMatched 변수 초기화
		
		for(int z = 0; z<10; z++) {//0부터 9까지 10회 반복하면서
			System.out.println("찾는 숫자를 입력>>");//입력메시지 출력
			int guess = sc.nextInt();//guess변수에 입력 메소드 선언
			
			if(guess ==magicNumber) {//만약 입력한 숫자와 정답이 같다면
				System.out.println((i+1)+ "번째에 맞췄습니다!");//i+1번쨰에 맞췄다는 출력문과
				isMatched = true;//논리형 변수를 true로 바꾸고
				break;//if반복문 종료
				
			}else if(guess>magicNumber) {//입력한 숫자가 정답보다 크면 아래 출력
				System.out.println("맞춰야할 숫자가 더 작습니다");
			}else if(guess<magicNumber) {//입력한 숫자가 정답보다 작으면 아래 출력
				System.out.println("맞춰야할 숫자가 더 큽니다");
			}	
		}
		if(!isMatched) {//10번의 반복안에 정답을 맞치지 못해 isMatched가 false로 빠져나왔때 조건을 true로 만들어 아래 출력 
			System.out.println("정답을 맞추지 못했습니다");
		}
				
		
		
	}
}
