import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
		int t=sc.nextInt();
		while(t-->0){
		    int num=sc.nextInt();
		    
		    BigInteger fact=BigInteger.ONE;
		    
		    for(int i=2;i<=num;i++){
		        fact = fact.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(fact);
		}
		
		}

	}
}
