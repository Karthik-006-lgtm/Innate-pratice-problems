import java.util.Scanner;

public class mahasena {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		  int even=0;
		  int odd=0;
		
		while(n-->0){
		    int a=sc.nextInt();
		      if(a % 2 == 0)
		    {
		        even++;
		    }
		    else
		    {
		        odd++;
		    }
		}

		if(even > odd)
		{
		    System.out.println("READY FOR BATTLE");
		}
		else
		{
		    System.out.println("NOT READY");
		}
		

	}
}
