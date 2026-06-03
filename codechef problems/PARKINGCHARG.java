import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();//per hour amount
		int y=sc.nextInt();//extra amount for extra 1 hr
		int h=sc.nextInt();//extra hours count
		
		int totalcost=x+(h-1)*y;
		
		System.out.println(totalcost);

	}
}
