package pckg1;

public abstract class ChildClass  
{

	public abstract void sum();
	public void display()
	
{
  System.out.println("I am parewnt class abstract method");		
}
	
	
	public void display2()
	
	{
		System.out.println("I am child class display2 method");
		
	}
	public static void main(String[] args) 
	{
	
		ClassC c=new ClassC();
		c.display();
		
	}
	

}
