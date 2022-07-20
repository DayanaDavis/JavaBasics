package Exception_handling;

import javax.xml.crypto.dsig.dom.DOMValidateContext;

public class Eligible
{
	static void validate(int age)
	{
	
		try{
			if (age<18)
	
		{
		throw new ArithmeticException();	
		}
		else
		{
			System.out.println("eligible");
		}
}
	catch(ArithmeticException e)
	{
		System.out.println("please enter the age greater than 18");	
	}
	catch(Exception e)
	{
		System.out.println("Exceptions");	
	}
	}
	

	public static void main(String[] args) 
	{
		
		validate(18);
	}

}
