package pckg1;

public class ClassC
{
	 static int deepak;
	public static void display1()
	
	{
		deepak=20;
		display2();
		System.out.println("ali baba");
	}
	public static void display2()
	
	{
		display1();
		int a=20;
	   System.out.println("ascfadfdasf");
	}

public static void main(String[] args) 
{

	ClassC.a=27;
	display2();
	System.out.println("I am a main methiod");
}
}

