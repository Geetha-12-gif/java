import java.util.*;
class R1921107187
{
	public static void main(String args[])
	{
		int sum=0;
		int i,n=6;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(n == sum)
			{
				System.out.println("perfect numbers");
			}
	}
}