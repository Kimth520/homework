package classType;

public class EX11_05 {
	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색",6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		Calendar c = new DeskCalendar("검은색", 12);
		c.info();
		c.hanging();//오버라이딩된 메서드를 호출
//		c.onTheDesk();//에러/다운캐스팅이 필요함
	}
}
