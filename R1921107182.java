import java.util.*;
class R1921107182
{
	public static void main(String args[])
	{
		int max=0;
		int min=0;
		int a[]={14,16,87,36,25,89,34};
		int m=1;
		int n=3;
		int temp=0;
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{	
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		if(m==0)
		{
		System.out.println("enter valid input");
		}
		else
		{
		min=a[n-1];
		max=a[a.length-m];
		System.out.println("mth maximum number:"+max);
		System.out.println("nth minimum number:"+min);
		System.out.println("sum:"+(max+min));
		System.out.println("difference:"+(max-min));
		}
	}
}