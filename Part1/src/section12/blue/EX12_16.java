package section12.blue;

public class EX12_16 {

	public static void main(String[] args) {
		BluetoothMIC bm = new BluetoothMIC();
		
		bm.sing();
		bm.music();
		
		System.out.println();
		
		Microphone m = bm;
		m.sing();
//		m.music(); // 사용불가
		
		System.out.println();
		
		Speaker s = bm;
		s.music();
//		s.sing(); // 사용불가
	}

}
