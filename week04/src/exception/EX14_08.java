package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요>>");
			int score = sc.nextInt();
			if(score >= 60) {
				System.out.println("합격입니다");
			}else {
				System.out.println("아쉽네요. 불합격입니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 올바르지 않습니다");
		}finally{//예외 유무와 상관없이 실행되며 프로그램 종료
			sc.close();
			System.out.println("프로그램 종료");
		}
		
		
	}
}
