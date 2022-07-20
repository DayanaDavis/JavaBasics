//import java.util.*;
public class AddFunction {
	
	static double total=0;
	
public static void add(int a,int b)
{
	total=(double)a/b;
	System.out.print(total);
}
public static long add(int a,int b, int c)
{
	return(a+b+c);
}
public static float add(float a,float b)
{
	return a+b;
}
public static void main(String args[])
{
	add(10,4);
//	System.out.println(add(12,34,56));
	//System.out.println(add(2.4f,5.9f));
}

}
