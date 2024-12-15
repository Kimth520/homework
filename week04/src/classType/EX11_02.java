package classType;

class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{}

class OpenCar extends Car{}
class SportsCar extends OpenCar{}

public class EX11_02 {
	public static void main(String[] args) {
		Car c1 = new SchoolBus();//1차 상속 관계가 아니더라도 자동 타입 변환 가능
		
		Bus b1 = new Bus();//자동 타입 변환
		Bus b2 = new SchoolBus();//자동 타입 변환
		
		Car c2 = new OpenCar();//자동 타입 변환
		OpenCar oc = new SportsCar();//자동 타입 변환
		
		//버스가 오픈카나 스포츠카로 타입변환하면 오류
		
	}
}
