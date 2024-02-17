package section12.blue;

public class BluetoothMIC implements Microphone, Speaker{
	@Override
	public void sing() {
		System.out.println("마이크로 노래 부르기");
	}
	
	@Override
	public void music() {
		System.out.println("마이크 스피커로 반주가 나옴");
	}
}
