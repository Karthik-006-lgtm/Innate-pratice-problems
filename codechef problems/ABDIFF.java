import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int add=a+b;
		int prod=a*b;
		int diff=prod-add;
		System.out.println(Math.abs(diff));
		
	}
}
