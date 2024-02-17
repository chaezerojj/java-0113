package section12.phone;

public abstract class Phone {
	abstract void openingLogo();
	
	void powerOn() {
		openingLogo();
		System.out.println("핸드폰이 켜집니다.");
	};
	void powerOff() {
		openingLogo();
		System.out.println("핸드폰이 꺼집니다.");
	};

}
