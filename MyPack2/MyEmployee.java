package MyPack2;
public class MyEmployee
{
	public static void main(String[] args)
	{
		Employee obj1=new Employee();
		Employee obj2=new Employee();
	    obj1.set_Data(1,"Shweta",12000);
	    obj2.set_Data(2,"Ankita",13000);
	    obj1.show_Data();
	    System.out.println("-------------------------");
	    obj2.show_Data();
	    System.out.println("-------------------------");
	    System.out.println("Highest Salary Employee");
	    if(obj1.salary()>obj2.salary())
	    	obj1.show_Data();
	    else
	    	obj2.show_Data();
	} 
}

