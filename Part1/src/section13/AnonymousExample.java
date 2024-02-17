//package section13;
//
//interface buttonClickListener {
//	public class Button {
//		private buttonClickListener listener;
//
//		public void setButtonListener(buttonClickListener listener) {
//			this.listener = listener;
//		}
//		public void Click() {
//			if (listener != null) {
//				this.listener.click();
//			}
//
//		}
//	}
//}
//
//public class AnonymousExample {
//
//	public static void main(String[] args) {
//		AnonymousExample exam = new AnonymousExample();
//		AnonymousExample.Button button = exam.new Button();
//		button.setButtonListener(new buttonClickListener() {
//			@Override
//			public void click() {
//				System.out.println("버튼을 눌렀습니다.");
//			}
//			
//		});
//		button.click();
//	}
//
//}
