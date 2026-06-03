import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int count = sc.nextInt();   
        int n1 = 0;int n2 = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 2; i <= count; ++i) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
