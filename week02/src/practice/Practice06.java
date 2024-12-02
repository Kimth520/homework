package practice;

public class Practice06 {
	public static void main(String[] args) {
		//예제 3-12
		int x = 10;
		int y = 1;
		
		y+= x;//y=y+x 후 y값 저장
		System.out.println(y);//1+10 =11
		
		y*= x;//y= y*x 후 y값 저장
		System.out.println(y);//11 * 10 = 110
		
		y%= x;//y=y%x 
		System.out.println(y);//110%10 = 0
		
		//예제 3-13
		int a = 10;
		int b = 20;
		//대소연산자 true or false 출력
		System.out.println(a>b);//a는 b보다 크다
		System.out.println(a<=b);//a는 b보다 작거나 같다
		System.out.println(a==b);//a는 b와 같다
		System.out.println(a!=b);//a는 b와 다르다
		
		//예제 3-14 
		int a1 = 10;
		int b1 = 11;
		
		System.out.println(a <= b); //a는 b보다 작거나 같다
		System.out.println(a == b); // a는 b와 같다
		System.out.println(a != --b);//a는 b에 -1한값과 같다
		
		//예제 3-15
		boolean b2 = true; //논리형 변수 b2에 true 값 대입 
		boolean b3 = false;//논리형 변수 b3에 false 값 대입 
		boolean b4 = true;//논리형 변수 b4에 true 값 대입 
		boolean b5 = false;//논리형 변수 b3에 false 값 대입
		
		System.out.println("####논리곱###");
		System.out.println(b2 && b3);//하나만 true여서 false
		System.out.println(b2 && b4);//두항이 모두 true여서 true
		System.out.println(b3 && b5);//두항이 모두 false 라서 true
		System.out.println();
		
		System.out.println("####논리합###");
		System.out.println(b2 || b3);//b2가 true여서 true
		System.out.println(b2 || b4);//두항이 모두 true라서 true
		System.out.println(b3 || b5);//두항이 모두 false 라서 false
		System.out.println();
		
		System.out.println("####배타적 논리합###");
		System.out.println(b2 ^ b3);//달라서 true
		System.out.println(b2 ^ b4);//같아서 false
		
		//예제 3-16
		int num = (7>1)?1:2; //()안이 참이면 1, 거짓이면 2
		System.out.println(num);
		
		//예제 3-16
		int num1 = 0;//정수형 변수 num1 초기화
		
		if(7>1) {//만약 ()안이 참이라면 아래값
			num1 = 1;
		}else {//아니라면 아래값
			num1 = 2;
		}
		System.out.println(num1);//결과값 출력
	}
}
