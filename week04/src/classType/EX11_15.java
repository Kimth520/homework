package classType;

class Animal{
	void cry() {}//텅 빈 메서드
}
class Pig extends Animal{

	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
	
}
class Cow extends Animal{

	@Override
	void cry() {
		System.out.println("음메");
	}
	
}

class Farm{
	void sound(Animal animal) {
//		if(animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		}else {
//			System.out.println("음메");
//		}
		animal.cry();//매개변수 참조 객체의 오버라이딩된 메서드를 호출
	}
}
public class EX11_15 {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
}
