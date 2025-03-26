package Inheritance;

public class SalaryComp extends Employee {
	double hra, pf;
	public SalaryComp(double basicPay,double deduction,double bonus)
	{
		super(basicPay, deduction, bonus);
		calculate();
	}
	public void calculate()
	{
		hra = 0.05 * basicPay;
		pf = 0.20 * basicPay;
	}

}
