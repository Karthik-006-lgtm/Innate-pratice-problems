import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()){
		int t=sc.nextInt();
		while(t-->0){
		    int num=sc.nextInt();
		    int dup=num;
		    int sum=0;
		    
		    while(num!=0){
		        int div=num%10;
		        sum=sum*10+div;
		        num=num/10;
		    }
		    if(sum==dup){
		        System.out.println("wins");
		    }
		    else{
		        System.out.println("loses");
		    }
		}
		}

	}
}
