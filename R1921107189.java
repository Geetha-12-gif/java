import java.util.*;
class R1921107189
{
	public static void main(String args[])
	{
		int total=0;
		int m1=90,m2=91,m3=92,m4=93;
		double agg;
		total=(m1+m2+m3+m4);
		agg=total/4;
		System.out.println("total marks="+total);
		System.out.println("aggregate="+agg);

		if(agg>75)
		{
			System.out.println("Distinction");
		}
		else if(agg<75 && agg>=60)
		{
			System.out.println("first division");
		}
		else if(agg<=60 && agg>=50)
		{
			System.out.println("second division");
		}
		else if(agg<=50 && agg>=40)
		{
			System.out.println("third division");
		}
		else
		{
			System.out.println("fail");
		}
	}
}