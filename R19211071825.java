class R19211071825 implements Runnable
{
	int n=9;
	public void run()
	{
	try
	{
	for(int i=2;i<=n/2;i++)
	{
	if(n%i == 0)
	{
	System.out.println("is not a prime number");
	}
	else
	{
	System.out.println("is a prime number");
	break;
	}
	}	
	}
	catch(Exception e)
	{
	System.out.println("executed successfully");
	}
	}
public static void main(String args[])
{
	R19211071825 R=new R19211071825();
	Thread t=new Thread(R);
	t.start();
}
}

