import java.util.*;
class R19211071810
{
	public static void main(String args[])
	{
		int income=200000;
		double tax;
		if(income>=500001)
		{
			tax=income*0.3;
			System.out.println("tax="+tax);
		}
		else if(income>=300001 && income<=500000)
		{
			tax=income*0.2;
			System.out.println("tax="+tax);
		}
		else if(income>150001 && income<=300000)
		{
			tax=income*0.1;
			System.out.println("tax"+tax);
		}
		else 		{
			System.out.println("no tax");
		}
	}
}