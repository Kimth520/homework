package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("점수를 입력하세요 : ");
			int score = sc.nextInt();//정수 타입의 값을 입력받아야함//아니면 예외 발생
			
			if(score >= 65) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("합격입니다");
			}
		} catch (InputMismatchException e) {//키보드 입력이 잘못되면 InputMismatchException예외 발생
			System.out.println("키보드 입력이 잘못되었습니다");
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}
}
