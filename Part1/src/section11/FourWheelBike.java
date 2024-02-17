package section11;

public class FourWheelBike extends Bike {
	public FourWheelBike(String riderName) {
		// TODO Auto-generated constructor stub
		super(riderName);
	}

	@Override
	void ride() {
		super.ride();
	}
	
	void addWheel() {
		if(wheel ==2) {
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조 바퀴를 답니다.");
		} else {
			System.out.println(riderName + "의 자전거는 이미 보조 바퀴가 있습니다.");
		}
	}
}
