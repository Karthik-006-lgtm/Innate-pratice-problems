import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();   
        int sum = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        double average = (double) sum / n;
        System.out.println("The average is: " + average);
    }
}
