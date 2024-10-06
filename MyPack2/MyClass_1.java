package MyPack2;
public class MyClass_1 
{
	public static void main(String[] args) 
	{
      Point1 obj=new Point1();
      Point1 P=new Point1();
      obj.set(12,12);
      P.set(25,25);
      obj.show_info();
      System.out.println("---------------");
      P.show_info();
      System.out.println("---------------");
      System.out.println("Greater Value");
      if(obj.comp()>P.comp())
    	  obj.show_info();
      else
    	  P.show_info();
	}
}

