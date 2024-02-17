package section13;

public class MyCar {
	private int price;
	private String myName;
	
	public MyCar(int price, String myName) {
		this.myName = myName;
		this.price = price;
	}
	
	public String getInfo() {
		String str = "차량: " + myName + ", 가격: " + price;
		return str;
	}
	
	public class Promotion {
		public int discount() {
			int discount = 0;
			discount = price / 100;
			return discount;
		}
	}
	
}
