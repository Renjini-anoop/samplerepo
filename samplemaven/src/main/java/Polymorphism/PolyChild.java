package Polymorphism;

public class PolyChild extends PolyParent{
	public void display(int a, int b)
	{
		int s= a+b;
		System.out.println("child sum : "+s);
		super.display(6, 9);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolyChild obj = new PolyChild();
obj.display(8, 5);
	}

}
