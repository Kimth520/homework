package classType;

public class EX11_12 {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
//		cr.computer1 = new Samsong();//삼송 컴퓨터1
//		cr.computer2 = new Samsong();//삼송 컴퓨터1
		
		cr.computer1 = new LZ();
		cr.computer2 = new LZ();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
		
		
		
	}
}
