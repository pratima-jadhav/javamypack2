package MyPack2;
public class Parameterconstructor {

	public static void main(String[] args)
	{
		ParaMeter1 P1=new ParaMeter1();
		P1.show_data();
		ParaMeter1 P2=new ParaMeter1(2);
		P2.show_data();
		ParaMeter1 P3=new ParaMeter1(20,2.5f);
		P3.show_data();
	}

}

