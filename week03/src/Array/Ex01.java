package array;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
	public static void main(String[] args) {
		//예제 6-1
		int[] arr = new int[4];//정수형 자료형 arr에 배열의 크기가 4인 배열 신규 생성
		System.out.println(arr);//배열 변수 (참조형 변수)를 출력(주소값)
		
		//예제 6-2
		int[] ar1 = new int[4];//4개의 공간을 가진 정수형 배열 선언
		
		ar1 [0] = 1;//각 배열에 값을 삽입
		ar1 [1] = 2;
		ar1 [2] = 3;
		ar1 [3] = 4;
		
		System.out.println("ar1[0] = " + ar1[0]);//각 배열 출력
		System.out.println("ar1[1] = " + ar1[1]);
		System.out.println("ar1[2] = " + ar1[2]);
		System.out.println("ar1[3] = " + ar1[3]);
		
		//예제 6-3
		int[] intArray = new int[5];//5개의 공간을 가지는 정수형 배열 선언
		String[] strArray = new String[5];//5개의 공간을 가지는 문자열 배열 선언
		
		int[] varArray = {1, 2, 3, 4, 5};//정수형 배열에 5개의 값 대입
		
		System.out.println("intArray[0] = " + intArray[0]);//intArray 첫번째 값 출력
		System.out.println("intArray[1] = " + intArray[1]);//intArray 두번째 값 출력
		
		System.out.println("strArray[0] = " + strArray[0]);//strArray 첫번째 값 출력
		System.out.println("strArray[1] = " + strArray[1]);//strArray 두번째 값 출럭
		
		System.out.println("varArray[0] = " + varArray[0]);//varArray 첫번째 값 출력
		System.out.println("varArray[1] = " + varArray[1]);//varArray 두번째 값 출럭
		
		//예제 6-4
		int[] numbers = new int [10];//10개의 배열을 선언
		//배열에 랜덤 함수를 이용해 값을 입력
		for(int i=0; i<numbers.length;i++) {//배열의 길이 만큼 반복문
			numbers[i] = (int)(Math.random()*30 + 1);//랜덤함수를 이용해 1에서 30까지 랜덤값을 뽑아내고 정수형으로 변환해 각 배열 위치에 값 입력
		}
		int sum = 0;//총합을 구항 변수 선언
		for(int i = 0; i<numbers.length; i++) {//배열의 길이만큼 반복
			if(numbers[i]%2 ==0) {//짝수인 값만 구해서
				sum += numbers[i];//값 더하고 저장 반복
			}
		}
		for(int i = 0; i<numbers.length; i++) {//배열의 길이 만큼 반복
			System.out.println(numbers[i] + " ");//배열 출력
		}
		
		System.out.println();//줄바꿈
		System.out.println("배열의 짝수들의 합 : " + sum);//배열의 짝수들의 합 출력
		
		//예제 6-5
		char[] cards = {'1', 'L', '0', '2', 'V', '3', 'E'};//단일 문자 배열에 단어와 숫자 섞어 넣기
		String myWord = "";//문자열 변수 초기화
		
		for(int i = 0; i< cards.length; i++) {//배열 길이만큼 반복
			int word = cards[i];//정수타입으로 형변환/문자는 아스키코드에 의해 10진수 숫자로 대응되어 배열 저장
			//65에서90사이는 대문자 A~Z
			//97~122사이는 소문자 a~z
			if((word>=65&& word<=90) || (word>=97&&word <=122)) {//대문자이거나 소문자 영어 문자라면
				myWord += (char)word;//정수형 word를 문자형으로 형변환 하여, 문자열 변수에 순차적으로 저장
			}
		}
		System.out.println("단어 : "+ myWord);//출력
		
		//예제 6-6
		int[] ar2 = {1,6,2,3,10,7,4,5,8,9}; //배열 선언과 동시에 값 대입
		
		int temp = 0;// 값을 치환하기 위한 임시 변수 선언
		
		for(int i = ar2.length-1; i>0; i--) { //배열의 길이 -1 만큼 반복
			for(int j=0; j<i; j++) {//인덱스 0부터 인덱스 8까지 반복(비교대상이 나와 내 다음이기 때문)
				if(ar2[j] > ar2[j+1]) {//앞 숫자가 뒤의 숫자보다 크면 치환 진행
					temp = ar2[j+1];//빈 변수에 뒤의 작은 수를 대입
					ar2[j+1] = ar2[j];//뒤에 작은 수를 담고있던 곳에 앞의 더 큰 수를 대입
					ar2[j] = temp;//빈 앞의 공간에 temp에 넣어놨던 작은 수 대입
				}
			}
		}
		System.out.println("정렬 후 출력 : ");//출력문
		for(int i = 0; i<ar2.length; i++) {//배열 길이 만큼 반복
			System.out.print(ar2[i] + " ");//정렬 된 배열 출력
		}
		System.out.println();
		 
		//예제 6-7
		int[] ar3 = {1,6,2,3,10,7,4,5,8,9};//정수형 배열 선언 및 값 대입
		System.out.println(Arrays.toString(ar3));//반복문의 도움없이 배열을 출력
		
		//예제 6-8
		int [] ar4 = {1,6,2,3,10,7,4,5,8,9};//배열 선언 후 무작위로 값 대입
		System.out.println("정렬 전 배열 ; " + Arrays.toString(ar4));//정렬 전 배열 출력
		Arrays.sort(ar4);//오름차순 정렬
		System.out.println("오름차순 정력 : " + Arrays.toString(ar4));//정렬 후 배열 출력
		
		//예제 6-9
		Integer[] ar5 = {1,6,2,3,10,7,4,5,8,9};//배열 선언 후 무작위로 값 대입
		System.out.println("정렬 전 배열 ; " + Arrays.toString(ar5));//정렬 전 배열 출력
		Arrays.sort(ar5, Comparator.reverseOrder() );//내림차순 정렬
		System.out.println("오름차순 정력 : " + Arrays.toString(ar5));//정렬 후 배열 출력
		
		//예제 6-10
		int[] arr01 = {1, 2, 3};//정수형 배열 선언 및 값 대입
		int[] arr02 = arr01;//배열의 얕은 복사
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));//arr01 배열 출력
		arr02[1] = 10;//arr02의 1번 인덱스 값 10으로 변경
		//얕은 복사하고 값 변경 후 다시 출력 확인
		System.out.println("arr02배열 : " + Arrays.toString(arr02));//
		System.out.println("arr01배열 : " + Arrays.toString(arr01));//
		
		//예제 6-11                                                                        
		int[] card = {1, 6, 4, 3, 4, 2};//배열 선언
		int[] newCard = new int[card.length];//card배열을 복사할 배열을 선언
		
		for(int i = 0; i<card.length; i++) {//반복문을 통해 새로운 배열에 기존 배열값 대입
			newCard[i] = card[i];
		}
		
		System.out.println("card배열 : " + Arrays.toString(card));//기존 배열 출력
		System.out.println("newCard배열 : " + Arrays.toString(newCard));//새로운 배열 출력
		
		
	}
}
