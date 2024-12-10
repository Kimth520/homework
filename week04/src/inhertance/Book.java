package inhertance;

public class Book {// 클래스 선언
	// 필드 선언
	String title;
	String author;
//	int price;

	// 생성자 선언
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 메소드 생성
//	void info() {
//		System.out.println("책의 제목은 " + title + "이고, 가격은 " + price + "원입니다.");
//	}
	final void info_title() {//final 메서드 선언
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	void info_author() {
		System.out.println("책의 저자는 " + author + "입니다.");
	}
		
		
	

}
