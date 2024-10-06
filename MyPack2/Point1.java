package MyPack2;
public class Point1 
{
	private
	int a,b,c;
	
	public
	void set(int x, int y)
	{
		a=x;
		b=y;
		c=a+b;
	}
	void show_info()
	{
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		System.out.println("C= "+c);	
	}
	int comp()
	{
		return (c);
	}
}

