package section12.inter;

public interface Phone {
//	public static final int MAX_BATTERY_CAPACITY = 100;
	int MAX_BATTERY_CAPACITY = 100;
	
	void powerOn();
	void powerOff();
	boolean isOn();
	void watchUtube();
	void charge();
	
}
