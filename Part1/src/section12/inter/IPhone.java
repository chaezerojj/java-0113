package section12.inter;

public class IPhone implements Phone {
	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("🍎 Power On 🍎");
			isOn = true;
		} else {
			System.out.println("🍎 !Low Battery! 🍎");
		}
	}
	
	@Override
	public void powerOff() {
		System.out.println("🍎 Power off...");
		isOn = false;
	}
	
	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("🍎 Watching Utube 🍎");
			batteryCapacity -= 10;
			System.out.println("🍎 Now Your Battery is " + batteryCapacity + "%\n");
		} else {
			System.out.println("🍎 !Low Battery! 🍎");
			powerOff();
		}
	}
	
	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY) {
			System.out.println("🍎 --- Charging --- 🍎");
			batteryCapacity += 5;
			System.out.println("🍎 Charged... Now Your Battery is " + batteryCapacity + "%\n");
		} else {
			System.out.println("Yoy don't need to charge.");
			System.out.println("It's enough... " + batteryCapacity + "%\n");
		}
	}
}
