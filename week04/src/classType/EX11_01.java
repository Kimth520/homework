package classType;

class Parent{}
class Child extends Parent{}

public class EX11_01 {
	public static void main(String[] args) {
		Parent p1 = new Parent();//p1 객체 생성
		Child c1 = new Child();//c1 객체 생성
		
		Parent p2 = new Child();//자동 타입 변환/업캐스팅
		Parent p3 = c1;//자동 타입 변환
		
		if(p3==c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다");
		}
	}
}
