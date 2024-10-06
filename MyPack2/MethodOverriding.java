package MyPack2;
public class MethodOverriding 
{
	public static void main(String[] args)
	{
		MethodOverR1 R1=new MethodOverR1();
		System.out.println("inte="+R1.get(10, 20, 30));
		R1.get("Shweta","Padwal");
		System.out.println("Float="+R1.get(10.25f));
	}
}

