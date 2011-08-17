package testsubclass;

import testprotectetedconstructor.A;



public class B {

	public B() {
	}
	
	public void test() {
		new A(0) {
			public void test() {}
		};
	}
}
