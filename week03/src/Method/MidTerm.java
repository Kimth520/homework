package method;

public class MidTerm {
	//예제 8-16
	public int score(int[] scores) {//리턴값은 정수형 매개변수는 정수형 배열
		int result = 0;//변수 선언
		for(int i = 0; i<scores.length; i++) {//배열의 길이만큼 반복
			result +=scores[i];//총합 구함
		}
		return result;//매개변수로 받은 모든 값들을 더한 result값을 다시 반환
   }
}