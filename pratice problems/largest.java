import java.util.Scanner;
public class largest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The largest number is: " + a);
        } else if (b > a ) {
            System.out.println("The largest number is: " + b);
        } else if(b==a) {
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}