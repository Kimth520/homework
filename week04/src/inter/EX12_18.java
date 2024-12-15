package inter;

public class EX12_18 {
	public static void main(String[] args) {
		BluethoothMIC bm = new BluethoothMIC();
		
		bm.music();
		bm.sing();
		Microphone  m = bm;//다운캐스팅해서 Microphone 타입으로 변환
		Speaker s = bm;//다운캐스팅해서 Speaker 타입으로 변환
	}
}
