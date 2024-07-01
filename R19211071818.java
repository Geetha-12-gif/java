import java.util.*;
class R19211071818
{
	public static void main(String args[])
	{
	String str="He123LL@wor&*d";
	int i,a,d,s;
	a=d=s=0;
	
	for(i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch >='a' && ch <='z' || ch>='A' && ch<='Z')
		{
			a++;
		}
		else if(ch >='0' && ch <='9')
		{
			d++;
		}
		else
		{
			s++;
		}
	}
		System.out.println("alphabet characters="+a);
		System.out.println("digit characters="+d);
		System.out.println("special characters="+s);
	}
}

