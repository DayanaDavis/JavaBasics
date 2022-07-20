package Exception_handling;

import java.util.Scanner;

public class Division_Exception 
{

	public static void main(String[] args) 
	{
		int ans=0;;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter the number");
		
		int a=sc.nextInt();
		System.out.print("ENter the number");
		int b=sc.nextInt();
		try
		{
		ans=a/b;
		}
		catch(NullPointerException e)
		{
			ans=a/1;
			System.out.print("Exception occured=Null ");
		}
		catch (ArithmeticException e) 
		{
			System.out.print("Exception occured=Arith ");
		}
		catch (NumberFormatException e)
		{
			System.out.print("Exception occured=Num ");
		}
		catch (IndexOutOfBoundsException e) 
		{
			System.out.print("Exception occured=index ");
		}
		
		System.out.print("result is ");
		System.out.print(ans);
		
	}

}
