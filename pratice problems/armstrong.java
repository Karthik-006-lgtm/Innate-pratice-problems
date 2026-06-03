import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
