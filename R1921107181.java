import java.util.*;
class R1921107181
{
	public static void main(String args[])	
	{
		int count;
		int i,j;
		int primecount=0;
		int compositecount=0;
		int[] n={4,54,29,71,7,59,98,23};
		int index;
		for(index=0;index<n.length;index++)
		{
		int num=n[index];
		count =0;
		if(num>1)
		{
		for(i=1;i<=num;i++)
		{
		if(num%i==0)
		{
		count++;
		}
		}
		if(count==2)
		{
		primecount++;
		}
		else{
		compositecount++;
		}
		}
		}
		System.out.println("prime numbers are"+primecount);
		System.out.println("composite numbers are:"+compositecount);	
	}
}