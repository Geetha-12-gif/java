import java.util.*;
class R1921107184
{
	public static void main(String args[])
	{
		int reve=0,rem;
		int choice=2;
		String str="MADAM";
		String rev="";
		switch(choice)
		{
		case 1:
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
			if(str.equals(rev))
			{
			System.out.println(str+"is a palindrome string");
			}
			else
			{
			System.out.println(str+"is not a palindrome string");
			}
		break;
		case 2:
		int n=121;
		int on=n;
		while(n!=0)
		{
			rem=n%10;
			reve=reve*10+rem;
			n=n/10;
		}
		if(on == reve)
		{
			System.out.println(reve+"is a palindrome");
		}
		else
		{
			System.out.println(reve+"is not a palindrome");
		}
		break;
		default:
			System.out.println(
"invalid choice");
			break;
		}
	}
}