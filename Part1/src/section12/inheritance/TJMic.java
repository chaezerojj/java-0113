package section12.inheritance;

public class TJMic implements BluetoothMIC{
	@Override
	public void connect() {
		System.out.println("연결됨");
	}
	
	@Override
	public void sing() {
		System.out.println("노래");
	}
	
	@Override
	public void music() {
		System.out.println("음악");
	}
}
