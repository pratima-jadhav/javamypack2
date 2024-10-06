package MyPack2;
public class MyEmployee1
{
	public static void main(String[] args)
	{
		int i,tot=0,high=0;
		float avg=0;
		
		Employee1 e[]=new Employee1[5];
		System.out.println("Enter 5 Employee Details");
		
		for(i=0;i<5;i++)
		{
			e[i]=new Employee1();
			e[i].set_Data();
			tot=tot+e[i].salary();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Employee Details");
			e[i].show_Data();
			System.out.println("--------------------------");
		}
		
		avg=tot/5;
		System.out.println("Total Salary: "+tot);
		System.out.println("Average Salary: "+avg);
		System.out.println("--------------------------");
		
		for(i=1;i<5;i++)
		{
			if(e[i].salary()>high)
			high=e[i].salary();
		}
		for(i=1;i<5;i++)
		{
			if(e[i].salary()==high)
			System.out.println("Highest Salary Employee");
			e[i].show_Data();
		}
	} 
}

