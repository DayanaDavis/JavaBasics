package Exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassThrows 
{
void first() throws IOException 
{
second();	
}
void second() throws IOException 
{
	System.out.print("Helooo");
	FileInputStream f=new FileInputStream("/Desktop/first.txt");

	//throw new IOException();
	
}
	
	public static void main(String[] args) 
	{
		ClassThrows c1=new ClassThrows();
		try {
			c1.first();
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}

	}

}
