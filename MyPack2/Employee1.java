package MyPack2;
import java.util.Scanner;
public class Employee1
{
	private
	int eid;
	int sal;
	String name;
	
	public
	Scanner obj=new Scanner(System.in);
	
	void set_Data()
	{
		System.out.println("Enter id, Name, Salary");
		eid=obj.nextInt();
		name=obj.next();
		sal=obj.nextInt();
	}
	
	void show_Data()
	{
		System.out.println("Employee ID= "+eid);
		System.out.println("Employee Name= "+name);
		System.out.println("Employee Salary= "+sal);	
	}
	
	int salary()
	{
		return (sal);
	}
}

