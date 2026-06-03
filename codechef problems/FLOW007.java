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
		    int num=sc.nextInt();
		    int val=0;
		    while(num!=0){
		        int div=num%10;
		        val=val*10+div;
		        num=num/10;
		    }
		    System.out.println(val);
		}

	}
}
