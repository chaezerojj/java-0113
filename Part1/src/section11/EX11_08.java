package section11;

public class EX11_08 {

	public static void main(String[] args) {
		Bike b = new FourWheelBike("김일남");
		b.info();
		b.ride();
//		b.addWheel();
		
		System.out.println();
		
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.info();
		fwb.ride();
		fwb.addWheel(); 
	}

}
