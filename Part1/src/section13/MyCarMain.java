package section13;

public class MyCarMain {
	
	
	public static void main(String[] args) {
		MyCar mycar = new MyCar(100, "sonata");
		MyCar.Promotion promotion = mycar.new Promotion();
		System.out.println(mycar.getInfo() + ", 할인 금액: " + promotion.discount());
	}

}
