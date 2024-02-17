package section12.inter;

public class EX12_14 {

	public static void main(String[] args) {
		Person kim = new Person(new IPhone());
		kim.turnOnPhone();
		for(int i = 1; i < 6; i++) {
			kim.watchUtube();
			
			if(i % 3 == 0) {
				kim.chargePhone();
			}
		}
		kim.buyNewPhone(new Galaxy());
		kim.turnOnPhone();
		for(int i = 1; i < 6; i++) {
			kim.watchUtube();
			
			if(i % 3 == 0) {
				kim.chargePhone();
			}
		}
	}

}
