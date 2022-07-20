package Exception_handling;

public class UncheckedThrows 
{
	void one()
	{
	two();	
	}
	void two()
	{
	int a=10/0;
	
	}

	public static void main(String[] args) 
	{
		try
		{
		UncheckedThrows u1=new UncheckedThrows();
		u1.one();
		}
		catch(ArithmeticException e)
		{
			System.out.print("Arithmetic exception");
		}

	}

}
