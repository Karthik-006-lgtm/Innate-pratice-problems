import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the celsius degree: ");
        int c=sc.nextInt();

        float fahrenheit=(c*9/5)+32;              
        System.out.println("fahrenheit answer: "+fahrenheit);
    }
}
