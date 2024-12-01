package practice;

public class Practice02 {
	public static void main(String[] args) {
		
		//예제 2-11
		byte num1 = 20;//정수형 byte에 20 대입
		short num2 = 30;//정수형 short에 30 대입
		int num3 = 40;//정수형 int에 40 대입
		long num4 = 50;//정수형 long에 50 대입
		//출력 후 줄바꿈
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//예제 2-12
		byte num5 = 0110;//정수형 byte에 2진수 대입
		short num6 = 0107;//정수형 short에 8진수 대입
		int num7 = 0x46;//정수형 int에 16진수 대입
		long num8 = 69L;//정수형 long에 69 대입
		//출력 후 줄바꿈
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//예제 2-13
		double marathon = 42.195;//실수형 double 변수 선언 및 초기화
		float halfMarathon = 21.0975f;//실수형 float 변수 선언 및 초기화
		//출력 후 줄바꿈
		System.err.println("마라톤은 " + marathon + "km를 달립니다.");
		System.err.println("하프 마라톤은 " + halfMarathon + "km를 달립니다.");
		
		//예제 2-14
		double pieDouble = 3.141592653589793;//실수형 double 변수 선언 및 초기화
		float pieFloat = 3.141592653589793f;//실수형 float 변수 선언 및 초기화
		//출력후 줄바꿈
		System.out.println("double : " + pieDouble);
		System.out.println("float : " + pieFloat);
		
		//예제 2-15
		char ga = '가';//문자형(정수형) char 변수 선언 및 초기화
		char na = '나';
		char alphabetA = 'A';
		char alphabetB = 'B';
		//출력후 줄바꿈
		System.out.println(ga);
		System.out.println(na);
		System.out.println(alphabetA + ", "+ alphabetB);
		
		//예제 2-16
		int ga1 = '가';//정수형 int에 문자 저장
		int na1 = '나';
		int alphabetA1 = 'A';
		int alphabetB1 = 'B';
		//유니 코드값 출력
		System.out.println(ga1);
		System.out.println(na1);
		System.out.println(alphabetA1);
		System.out.println(alphabetB1);
		
		//예제 2-17
		int alphabetA2 = 'A';//정수형 int에 문자저장 
		int alphabetB2 = 'B';
		System.out.println(alphabetA2);
		System.out.println(alphabetB2);
		
		char alphabetC2 = 67;//유니코드 정수 67을 문자형에 저장
		System.out.println(alphabetC2);
		
		//예제 2-18
		boolean isStudent = true;//논리형에 true값 대입
		System.out.println(isStudent);
		
		//예제 2-19
		boolean isStudent1 = true;//논리형에 true값 대입
		
		if(isStudent) {//만약 true이면
			System.out.println("저는 학생입니다.");
		}else {//false이면,
			System.out.println("저는 학생이 아닙니다.");
		}
		
		//예제 2-20
		String hi = "안녕하세요,"; //참조 자료형 String에 문자열 저장
		String niceToMeetYou = "만나서 반갑습니다.";
		
		System.out.println(hi);//문자열 출력 후 줄바꿈
		System.out.println(niceToMeetYou);
		
	}
}
