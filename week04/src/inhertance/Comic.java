package inhertance;

public class Comic extends Book {// Book 클래스를 상속받는 자식 클래스 Comic
	boolean isColor;

	public Comic(String title, String author, boolean isColor) {
		super(title, author);
		this.isColor = isColor;
	}

//fianl로 선언된 메소드인 void info_title()은 오버라이딩 안됨

	@Override
	void info_author() {
		System.out.println("이 만화책의 저자는 " + author + "입니다");
	}

	void info_color() {
		if (isColor) {
			System.out.println("이 만화책은 컬러입니다");
		} else {
			System.out.println("이 만화책은 흑백입니다");
		}
	}
}
