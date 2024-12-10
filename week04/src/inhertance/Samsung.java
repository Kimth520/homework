package inhertance;

public class Samsung extends Computer{

	@Override
	void powerOn() {
		super.powerOn();//부모 클래스(Computer)의 power.on() 메서드 호출
		System.out.println("아이 러브 삼송");
	}
	
}
