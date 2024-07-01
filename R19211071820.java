import java.util.*;
class R19211071820
{
	double SBI,ICIC,AXIS;
	void get()
	{
	SBI=8.4;
	ICIC=7.3;
	AXIS=9.7;
	}
	void display()
	{
	System.out.println("rate of interest for sbi:"+SBI);
	System.out.println("rate of interest for icic:"+ICIC);
	System.out.println("rate of interest for axis:"+AXIS);
	}
public static void main(String args[])
{
	R19211071820 R=new R19211071820();
	R.get();
	R.display();
}
}