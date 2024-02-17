package section11;

public class EX11_12 {

	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		cr.computer1 = new Samsong();
		cr.computer2 = new LZ();
		
		cr.allPowerOn();
		cr.allPowerOff();
	}

}
