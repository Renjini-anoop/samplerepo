package Abstraction;

public class AbstractionChild extends AbstractionParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj = new AbstractionChild();
		obj.dispaly();
		obj.show();

	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("Abstraction child");
	}

}
