package inter;

class Person{
	Phone p;
	
	Person(Phone p){//타입 변환을 통해 다형성을 구현할 수 있음
		this.p = p;
	}
	
	void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println("= = = = = = = = = = = ="); 
		System.out.println("새 폰을 샀습니다!");
	}
	
	void turnOnPhone() {
		p.powerOn();
	}
	
	void turnOffPhone() {
		p.powerOff();
	}
	
	void watchUtube() {
		if(p.isOn()) {
			p.watchUtube();
		}else {
			System.out.println("폰이 꺼져 있기 때문에 U튜브를 볼 수 없습니다");
		}
	}
	
	void chargePhone() {
		p.charge();
	}
}
public class EX12_14 {
	public static void main(String[] args) {
		Person jimin = new Person(new PineapplePhone());
		jimin.turnOnPhone();
		for(int i = 1; i<6; i++) {
			jimin.watchUtube();
			
			if(i%3 == 0) {
				jimin.chargePhone();
			}
		}
		
		jimin.buyNewPhone(new ThreeStarPhone());
		jimin.turnOnPhone();
		
		for(int i=1; i<5;i++) {
			jimin.watchUtube();
			
			if(i%3==0) {
				jimin.chargePhone();
			}
		}
	}
}
