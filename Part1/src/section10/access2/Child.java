package section10.access2;

import section10.access1.Parent;

public class Child extends Parent {
	void accessTest() {
		super.accessProtected();
	}
}
