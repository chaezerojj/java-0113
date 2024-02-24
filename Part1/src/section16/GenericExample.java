package section16;

class Generic<E> {
	private E element;

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
	
	
}

public class GenericExample {

	public static void main(String[] args) {
		Generic<String> a = new Generic<String>();
		Generic<Integer> b = new Generic<Integer>();
		
//		a.setElement(10);
		a.setElement("10");
		b.setElement(10);
		
		System.out.println(a.getElement());
		System.out.println(b.getElement());
	}

}
