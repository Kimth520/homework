package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//예제 6-12
		int[] card = {3, 1, 4, 5, 10};
		int[] newCard = Arrays.copyOf(card, card.length);//배ㅇ열의 깊은 복사 = Arrys.copyOf(배열, 복사 범위)
		System.out.println("card 배열 : " + Arrays.toString(card));
		
		card[1] = 10;//card 배열 값 변경
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
		
		
		//예제 6-13
		int[] card1 = {1, 6, 4, 5, 3, 2};
		int[] newCard1 = new int[card1.length];
		//(복사 대상 배열, 복사 시작 위치, 카피할 배열, 시작 위치, 복사할 길이)
		System.out.println("card1 배열 : " + Arrays.toString(card1));
		System.out.println("newCard1 배열 : " + Arrays.toString(newCard1));
		
		
		//예제 6-14
		int[][]arr = new int[2][3];//행과 열을 지정하여 선언
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		//행의 주소 출력
		System.out.println("2차원 배열 : " + arr);
		//1행이 가징 열에 대한 주소 출력
		System.out.println("2차원 배열 1행 : " + arr[0]);
		//행의 크기 출력
		System.out.println("행의 크기 : " + arr.length);
		//각 행의 열 크기 출력
		System.out.println("1행의 열 크기 : " + arr[0].length);
		System.out.println("2행의 열 크기  : " + arr[1].length);
		//1행1열의 값 출력
		System.out.println("arr[0][0] : " + arr[0][0]);
		
		//예제 6-15
		int[][]arr1 = new int[5][5];
		int count = 1;
		//1부터 25까지 차례대로 배열의 값 넣기
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				arr[i][j] = count++;
			}
		}
		//배열 출력하기
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}
		
		//예제 6-16
		//당첨 번호 리스트
		int[][] lotto = {{2,6,11,33,42,44},{1,6,17,22,24,33},{7,16,24,33,42,44},{11,27,32,34,43,46}, {6,17,22,24,33,41}};
		//입력 클래스 import
		Scanner sc = new Scanner(System.in);
		String myNum = "";
		System.out.println("당첨 숫자 6개를 연속으로 입력해 주세요. >>");
		myNum = sc.next();
		
		//당첨 여부를 나타내는 변수
		boolean isWin = false;
		
		for(int i = 0; i<lotto.length; i++) {
			//당첨 번호를 만들기 위한 변수
			String lottoNumber = "";
			//한 행의 번호를 더해서 하나의 숫자로 만든다
			for(int j = 0; j<lotto[i].length; j++) {
				lottoNumber += lotto[i][j];
			}
			//문자열은 비교할 때 equals 함수를 사용하여 비교
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
		}
		//if문으로 당첨 여부 출력
		if(isWin) {
			System.out.println("번호 당첨!!");
		}else {
			System.out.println(myNum + "번호는 당첨되지 못했습니다.");
		}
		sc.close();
		
		
		//예제 6-17
		int[] score = {90,92,93};//점수 배열 선언
		//필요한 변수 선언
		int sum = 0;
		double avg = 0;
		
		//향상 for문으로 총합 구하기
		for(int val : score) {
			sum += val;
		}
		//평균 구하고 출력
		avg = (double)sum/3;
		System.out.println("총점 : " + sum + ", 평균 : " + avg);

		
	}
		
 }
