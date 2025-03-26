package Inheritance;

public class Salary extends SalaryComp {
	double total;
	public Salary(double basicPay, double deduction, double bonus)
	{
		super(basicPay, deduction,bonus);
		calculateSalary();
	}
	public void calculateSalary()
	{
		total = basicPay + hra-pf-deduction+bonus;
	}
public void printSalary()
{
	System.out.println("\n Salary Slip \n");
	System.out.println("Basic Pay : "+basicPay);
	System.out.println("Deduction : "+deduction);
	System.out.println("HRA (5%) : "+hra);
	System.out.println("PF (20%) : "+pf);
	System.out.println("Bonus : "+bonus);
	System.out.println("Total Salary : "+total);
	
}
public static void main(String args[])
{
	double basicPay = 6000;
	double deduction = 4000;
	double bonus = 3000;
	Salary obj = new Salary(basicPay, deduction, bonus);
    obj.printSalary();
}
}
