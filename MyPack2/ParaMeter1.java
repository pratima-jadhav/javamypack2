package MyPack2;
public class ParaMeter1 
{
	private
	int a;
	float b;
	
	public
	ParaMeter1()
	{
		a=25;
		b=2.5f;
	}
	
	ParaMeter1(int a)
	{
		this.a=a;
	}
	ParaMeter1(int a, float b)
	{
		this.a=a;
		this.b=b;
	}
	
	void show_data() 
	{
		System.out.println(a);
		System.out.println(b);
	}
}
