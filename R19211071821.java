class R1921107182
{
	int n,m;
	void get()
	{
		n=100;
		m=200;
	}
}
class R192110718212 extends R1921107182
{
	void display()
	{
		System.out.println(n);
		System.out.println(m);
	}
}
class R19211071821
{
public static void main(String args[])
{
	R192110718212 R=new R192110718212();
	R.get();
	R.display();
}
}