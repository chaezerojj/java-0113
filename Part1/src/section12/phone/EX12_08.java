package section12.phone;

public class EX12_08 {

	public static void main(String[] args) {
		IPhone i = new IPhone();
		i.powerOn();
		i.powerOff();
		
		System.out.println();
		
		Galaxy g = new Galaxy();
		g.powerOn();
		g.powerOff();
	}

}
