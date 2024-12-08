package constructor;

public class Book {//클래스 선언
	//예제 9-11 오버로딩
	String title = "제목없음";//인스턴스 필드 선언
	int series = 1;
	int page = 100;
	
	public Book() {//생성자 1
		
	}

	public Book(String t) {//생성자 2
		title = t;
	}

	public Book(String t, int p) {//생성자 3
		title = t;
		page = p;
	}

	public Book(int s, String t) {//생성자 4
		series = s;
		title = t;
		
	}
	
	
	
	
	
	
	
}
