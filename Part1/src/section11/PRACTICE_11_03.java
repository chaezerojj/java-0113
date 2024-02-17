package section11;

class Speaker{
	public String getName() {
		return "스피커";
	}
}

class RedSpeaker extends Speaker {
	@Override
	public String getName() {
		return "빨간색 스피커";
	}
}
class BlueSpeaker extends Speaker{
	@Override
	public String getName() {
		return "파란색 스피커";
	}
}


class Person {
	Speaker speaker;
	
	public Person(Speaker speaker) {
		this.speaker = speaker;
	}
	
	void turnOn() {
		System.out.println(speaker.getName() + "가 켜졌습니다.");
	}
}

public class PRACTICE_11_03 {

	public static void main(String[] args) {
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn();
		
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn();
	}

}
