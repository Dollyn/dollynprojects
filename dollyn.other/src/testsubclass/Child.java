package testsubclass;

public class Child extends Parent {

	public void method() {
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.method();
		Parent cParent = new Child();
		cParent.method();
		Child child = new Child();
		child.method();		
	}
}
