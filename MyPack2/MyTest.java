package MyPack2;
//write a program create MyTest class create 3 parameterized constructor
//1.Pass 3 integer
//2.pass 2 string value
//3. 1 float value
public class MyTest {

	public static void main(String[] args)
	{
		MyTest1 T1=new MyTest1(2,5,7);
		T1.show_data();
		MyTest1 T2=new MyTest1("Shweta","Ankita");
		T2.show_data();
		MyTest1 T3=new MyTest1(2.5f);
		T3.show_data();
		
		
	}

}

