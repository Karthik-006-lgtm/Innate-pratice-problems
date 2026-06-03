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
		    
		    long fact=1;
		    
		    for(int i=1;i<=num;i++){
		        fact=fact*i;
		    }
		    System.out.println(fact);
		}

	}
}
