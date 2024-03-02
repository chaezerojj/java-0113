package section16;

public class TextMessage {
	private int msgNumber;
	private String msg;
	
	public TextMessage(int msgNumber, String msg) {
		this.msgNumber = msgNumber;
		this.msg = msg;
	}
	
	public int getMsgNumber() {
		return msgNumber;
	}
	
	public String getMsg() {
		return msg;
	}
	
	@Override
	public int hashCode() {
		return msgNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TextMessage) {
			TextMessage compare = (TextMessage)obj;
			if (this.msg.equals(compare.getMsg())) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
}
