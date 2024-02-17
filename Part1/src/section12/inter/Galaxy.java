package section12.inter;

public class Galaxy implements Phone {
	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("✨ 전원이 켜졌습니다. ✨");
			isOn = true;
		} else {
			System.out.println("✨!배터리가 낮습니다!✨");
		}
	}
	
	@Override
	public void powerOff() {
		System.out.println("✨ 전원이 꺼집니다...\n");
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
			System.out.println("✨ Utube를 시청중입니다 ✨");
			batteryCapacity -= 5;
			System.out.println("✨ 잔여 배터리는... " + batteryCapacity + "%\n");
		}
	}
	
	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("✨ --- 충전중 --- ✨");
			batteryCapacity += 10;
			System.out.println("✨ 충전됨... 잔여 배터리는" + batteryCapacity + "%\n");
		} else {
			System.out.println("충전할 필요가 없습니다.");
			System.out.println("✨ 충전됨... 잔여 배터리는" + batteryCapacity + "%\n");
		}
	}
}
