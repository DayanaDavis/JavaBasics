package Exception_handling;

public class Nullpointer 
{
	String s="dayana";
	int l;
	void length()
	{
	l=s.length();	
	}
	public static void main(String[] args) 
	{
		try
		{
		Nullpointer n1=new Nullpointer();
		n1.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		finally
		{
			System.out.println("finally block");
		}
		

	}

}
