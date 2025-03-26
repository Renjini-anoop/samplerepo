package ExceptionHandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =20;
if(age>18)
{
	System.out.println("Eligible");
}
else
{
	throw new ArithmeticException("Age under 18");
}
	}

}
