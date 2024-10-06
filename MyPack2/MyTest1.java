package MyPack2;
//write a program create MyTest class create 3 parameterized constructor
//1.Pass 3 integer
//2.pass 2 string value
//3. 1 float value
public class MyTest1 
{
		private
		int a,b,c;
		float d;
		String n1,n2;
		
		public
	
		MyTest1(int a, int b, int c)
		{
			System.out.println("Pass 3 integer");
			this.a=a;
			this.b=b;
			this.c=c;
		}
		
		MyTest1(String n1, String n2)
		{
			System.out.println("pass 2 string value");
			this.n1=n1;
			this.n2=n2;
		}
		MyTest1(float d)
		{
			System.out.println("1 float value");
			this.d=d;
		}
		
		void show_data() 
		{
			System.out.println("A="+a);
			System.out.println("B="+b);
			System.out.println("C="+c);
			System.out.println("D="+d);
			System.out.println("String 1="+n1);
			System.out.println("String 2="+n2);
			System.out.println("----------------------------------");
		}
}

