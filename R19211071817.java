import java.util.Scanner;
class R19211071817
{
	public static void main(String[] args)
	{
		String bin="1101";
		int decimal = Integer.parseInt(bin,2);
		String oct=Integer.toOctalString(bin);
		System.out.println(decimal);
		System.out.println(oct);
	}
}
