package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	public void display1()
	{
		System.out.println("This is the child class");
		super.display();
	}

	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
		obj.display1();

	}

}
