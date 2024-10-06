package MyPack2;
import java.util.Scanner;
public class Product 
	{
		private
		int rate,quan,amt;
		String name;
		
		public
		Product()
		{
			name="Pen Dive";
			rate=500;
		}
		void get(int qua)
		{
			quan=qua;
			amt=rate*quan;	
		}
		void show_data() 
		{
			System.out.println("Name:"+name);	
			System.out.println("Quantity:"+quan);
			System.out.println("Rate:"+rate);
			System.out.println("Amount:"+amt);
			System.out.println("---------------------------");
		}
}