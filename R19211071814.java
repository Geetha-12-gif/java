import java.util.Scanner;
class R19211071814
{
	public static void main(String[] args)
	{
 		char[] ch={'W','d','A','G','g','H'};
		int lcount=0,ucount=0,ncount=0;
		for(char c:ch)
		{
		if(c>='A' && c<='Z')
		{
			ucount++;
			
		}
		if(c >= 'a' && c <= 'z')
		{
			lcount++;
			
		}
		if(Character.isDigit(c))
		{
			ncount++;
			
		}
		}
		System.out.println("total count of upper case"+ucount);
		System.out.println("total count of lower case"+lcount);	
		System.out.println("total count of number"+ncount);
	}
}