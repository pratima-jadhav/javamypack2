package MyPack2;
public class MethodOverR1 
{
	private
	int a,b,c;
	float d;
	String n1,n2;
	
	public

	int get(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		return (a+b+c);
	}
	
	void get(String n3, String n4)
	{
		this.n1=n3;
		this.n2=n4;
		System.out.println("Name1="+n1);
		System.out.println("Name2="+n2);
	}
	
	float get(float x)
	{
		d=x;
		return(d+d);
	}
	
}
