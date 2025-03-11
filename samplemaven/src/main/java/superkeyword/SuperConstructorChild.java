package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{
	public SuperConstructorChild()
	{
		super(5,7);
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();

	}

}
