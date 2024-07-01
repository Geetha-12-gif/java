class R19211071823 implements Runnable
{
	int n=10;
	public void run()
	{
	try
	{
	int n1=0,n2=1,n3;
	System.out.println(n1+" "+n2);
	for(int i=2;i<=n;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	}
	catch(Exception e)
	{
		System.out.println("executed successfully");
	}
	}
public static void main(String args[])
{
R19211071823 R =new R19211071823();
Thread t=new Thread(R);
t.start();
}
}