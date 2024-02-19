package section15;

public class Car {

//	public static void main(String[] args) {
//		Object ob = new Object();
//		System.out.println(ob);
//	}
	private String carName;
	private String carCompany;
	
	public Car(String carName, String carCompany) {
		this.carName = carName;
		this.carCompany = carCompany;
	}
	
	@Override
		public String toString() {
		String str = "차량 이름: " + carName + ", 제조사: " + carCompany;
			return str;
		}
	
}
