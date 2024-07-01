class R1921107182 extends Thread
{
	public void run()
	{
	try
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println(i+"*5="+i*5);
		Thread.sleep(1000);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	System.out.println("Existing a thread");
	}
}
class R192110718222 extends Thread
{
	public void run()
	{
	try
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"*9="+i*9);
			Thread.sleep(2000);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Existing a thread");
	}
}
class R19211071822
{
	public static void main(String args[])
	{
		R1921107182 R=new R1921107182();
		R192110718222 R1=new R192110718222();
		R.start();
		R1.start();
	}
}