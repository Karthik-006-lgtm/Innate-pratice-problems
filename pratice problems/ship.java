import java.util.Scanner;

public class ship {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
		    char ch=sc.next().charAt(0);
		    switch(ch){
		        case 'b':
		            System.out.println("BattleShip");
		            break;
		        case 'B':
		            System.out.println("BattleShip");
		            break;
		        case 'c':
		            System.out.println("Cruiser");
		            break;
		         case 'C':
		             System.out.println("Cruiser");
		            break;
		        case 'd':
		            System.out.println("Destroyer");
		            break;
		        case 'D':
		            System.out.println("Destroyer");
		            break;
		        default:
		        System.out.println("Invalid Input");
		    }
		}

	}
}
