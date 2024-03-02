package section17;

import java.math.BigDecimal;
import java.math.RoundingMode;

interface Calc {
	double round(int point);
}

public class LamdaExample {

	public static void main(String[] args) {
		double val = 34.1254886;
		
		Calc cal = (point) -> {
			double newVal = new BigDecimal(val).setScale(point, RoundingMode.HALF_UP).doubleValue();
			return newVal;
		};
		
		System.out.println("소수점 둘째 자리 반올림 : " + cal.round(2));
	}

}
