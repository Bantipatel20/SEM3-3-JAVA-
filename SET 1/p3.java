public class p3
{
	public static void main(String[] args)
	{
		double a=1234.5678;
		int b;
		b=(int)a;
		long c;
		c=b;
		short s;
		s=(short)((a-c)*10000);
		System.out.println(c+" and "+s);
	}
}