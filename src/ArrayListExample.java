

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Dayana");
		a1.add("Ann");
		a1.add("Sneha");
		a1.add("archana");
		a1.add("Krish");
		System.out.println(a1);
		
		String s=a1.get(3);
		System.out.println(s);
		
		int size=a1.size();
		System.out.println(size);
		
		a1.set(3, "java");
		System.out.println(a1);
		
		a1.remove(3);
		System.out.println(a1);
		
		a1.add(3, "Archana");
		System.out.println(a1);
		 
		//a1.iterator()
		if(a1.contains("Archana"))
		{
			int n1=a1.indexOf("Archana");
			System.out.println("element found at "+n1);	
		}
		
		
		Iterator<String> it =  a1.iterator();
		 while(it.hasNext())
		 {
			 String str=it.next();
			 System.out.println(str);
		 }
		}
	

}
