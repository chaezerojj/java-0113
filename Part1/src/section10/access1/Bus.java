package section10.access1;

public class Bus extends Car{
	int peopleNum;
	
	Bus(int peopleNum) {
		this.peopleNum = peopleNum; // peopleNum을 초기화
	}
	
	void takePerson() {
		System.out.println("승객이 버스에 탑승하였습니다.");
		peopleNum++;
		System.out.println("지금까지 탑승한 승객은 " + peopleNum + "명 입니다.");
	}
}
