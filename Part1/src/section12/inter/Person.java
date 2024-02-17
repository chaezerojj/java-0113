package section12.inter;

public class Person {
	Phone p;
	
	public Person(Phone p) {
		this.p = p;
	}
	
	void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println("= = = = = = = = = = = = =");
		System.out.println(" 새 폰을 샀습니다. ");
	}
	
	void turnOnPhone() {
		p.powerOn();
	}
	
	void turnOffPhone() {
		p.powerOff();
	}
	
	void watchUtube() {
		if (p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("전원이 꺼져 유튜브 시청이 불가합니다.");
		}
	}
	
	void chargePhone() {
		p.charge();
	}
	
	
	
}
