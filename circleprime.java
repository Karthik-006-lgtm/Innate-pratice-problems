import java.util.Scanner;

public class circleprime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }

        int original = num;

        int flag = 0;

        for(int i = 0; i < count; i++) {

            System.out.println(num);

            
            int prime = 1;

            if(num <= 1) {
                prime = 0;
            }

            for(int j = 2; j < num; j++) {

                if(num % j == 0) {
                    prime = 0;
                    break;
                }
            }

            
            if(prime == 0) {
                flag = 1;
                break;
            }

            
            int last = num % 10;
            int remain = num / 10;

            int power = (int)Math.pow(10, count - 1);

            num = (last * power) + remain;
        }

        if(flag == 0) {
            System.out.println("Circular Prime");
        }
        else {
            System.out.println("Not Circular Prime");
        }
    }
}