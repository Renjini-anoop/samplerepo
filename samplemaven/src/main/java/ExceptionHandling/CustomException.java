package ExceptionHandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age =10;
		if(age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new VotingException("Age under 18");
		}
	}

}
