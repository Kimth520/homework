package inhertance.access2;

import inhertance.access1.*;

public class Child extends Parent {
	void accessTest() {
		super.accessProtected();//이렇게만 접근가능
		Parent p1 = new Parent();//부모 객체 생성
//		p1.accessProtected();//자식 클래스더라도, 객체로 접근하는것은 불가능
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.accessProtected();
	}
}
