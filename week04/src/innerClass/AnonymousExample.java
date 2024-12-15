package innerClass;

interface buttonClickListener{//버튼 클릭 이벤트를 지닌 인터페이스를 선언
	public void click();
}

public class AnonymousExample {
	//버튼 객체를 내부 클래스로 선언
	public class Button{
		private buttonClickListener listener;
		//리스너를 파라미터를 통해 받는다
		public void setButtonListner(buttonClickListener listener) {//버튼 리스너를 외부로부터 받는 메서드 구현
			this.listener = listener;
		}
		
		//버튼 클릭 가능
		public void click() {//버튼을 클릭하는 메서드 구현/리스너가 있을 떄만 동작하도록 제어
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();//외부 클래스를 통해서 버튼 클래스를 선언
		AnonymousExample.Button button = exam.new Button();
		
		button.setButtonListner(//인터페이스를 익명 클래스로 선언하여 버튼 기능 구현해 추가
				new buttonClickListener(){
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다");
			}
		}
				);
		
		button.click();//버튼 클릭
	}

}
