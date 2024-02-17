package section08;

public class Bus {
	void take(int m) {
		while (true) {
			if (m < 3000) {
				System.out.println("교통카드를 충전해야 합니다.");
//				break;
				return;
			} 
			System.out.println("버스를 탈 수 있습니다.");
			m -= 1250;
		}
	}
}
