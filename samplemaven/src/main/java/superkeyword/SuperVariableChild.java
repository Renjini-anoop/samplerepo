package superkeyword;

public class SuperVariableChild extends SuperVariable {
	String colour = "White";
	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj = new SuperVariableChild();
		obj.display();
	}

}
