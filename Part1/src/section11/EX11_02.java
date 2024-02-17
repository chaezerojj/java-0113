package section11;

class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar {}

public class EX11_02 {
	
	public static void main(String[] args) {
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportsCar();
		
//		Bus b3 = new OpenCar(); // 에러 발생 - 상속관계에서만 타입 변환 가능
	}
}
