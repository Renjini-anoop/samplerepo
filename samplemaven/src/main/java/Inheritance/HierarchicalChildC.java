package Inheritance;

public class HierarchicalChildC extends HierarchicalParentA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChildC obj1 = new HierarchicalChildC();
		obj1.display();
		obj1.display2();

	}
	public void display2()
	{
		System.out.println("child class C");
	}
}
