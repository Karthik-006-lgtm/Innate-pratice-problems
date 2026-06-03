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
		            String num=sc.next();
		        
		        int count=0;
		        for(int i=0;i<num.length();i++){
		            if(num.charAt(i)=='4'){
		                count++;
		            }
		        }
		        System.out.println(count);
		    }
		 
		}

	}
}
