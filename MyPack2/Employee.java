package MyPack2;
public class Employee 
{
	private
	int eid;
	float sal;
	String name;
	
	public
	void set_Data(int x, String y, float z)
	{
		eid=x;
		name=y;
		sal=z;
	}
	void show_Data()
	{
		System.out.println("Employee ID= "+eid);
		System.out.println("Employee Name= "+name);
		System.out.println("Employee Salary= "+sal);	
	}
	
	float salary()
	{
		return (sal);
	}

}

