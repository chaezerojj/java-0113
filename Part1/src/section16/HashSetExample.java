package section16;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<TextMessage> msgSet = new HashSet<>();
		
		TextMessage msg1 = new TextMessage(1001, "Hello");
		TextMessage msg2 = new TextMessage(1001, "Hello");
		TextMessage msg3 = new TextMessage(1001, "Hello");
		TextMessage msg4 = new TextMessage(1002, "Hello");
		TextMessage msg5 = new TextMessage(1003, "Hello");
		
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		
		System.out.println(msgSet.size());
		
		for(TextMessage msg: msgSet) {
			System.out.println("번호: " + msg.getMsgNumber() + ", 메시지: " + msg.getMsg());
		}
	}

}
