import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    int p=sc.nextInt();
		    int count=0;
		    count=p/2048;   
		    p=p%2048;
		    count+=Integer.bitCount(p);
		    System.out.println(count);
		}

	}
}
