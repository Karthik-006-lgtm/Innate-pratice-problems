import java.util.Scanner;
public class celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        int fahrenheit = sc.nextInt();

        double celsius = (fahrenheit - 32) * 5 / 9 ;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
