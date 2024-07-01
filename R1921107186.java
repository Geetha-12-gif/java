import java.util.*;
class R1921107186
{
	public static void main(String args[])
	{
		double salary=8000;
		char grade='A';
		double bonus=0.0;
		if(grade=='A')
		{
			bonus=5.0;
		}
		else if(grade=='B')
		{
			bonus=10.0;
		}
		else
		{
			System.out.println("invalid grade");
		}
		if(salary<=10000)
		{
			bonus=2.0;
		}
		double bonusper=(bonus/100)*salary;
		double total=salary+bonusper;
		System.out.println("bonus"+bonusper);
		System.out.println("total salary"+total);
	}
}