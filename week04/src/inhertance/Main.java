package inhertance;

public class Main {//클래스 선언
	public static void main(String[] args) {
//		Comic comicBook = new Comic();
//		comicBook.title = "포켓몬";
//		comicBook.price = 4500;
//		comicBook.info();
		
		Comic comicBook = new Comic("주머니 괴물", "미상", true);//매개변수를 넣은 객체 선언
		comicBook.info_title();//객체.메서드
		comicBook.info_author();
		comicBook.info_color();
	}
	

}
