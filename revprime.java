import java.util.Scanner;
public class revprime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int sum=0;

        while(num!=0){
            int div=num%10;
            sum=sum*10+div;
            num/=10;
        }
        int flag = 0;

        
        for(int i = 2; i < sum; i++) {
            if(sum % i == 0) {
                flag = 1;
                break;
            }
        }

        System.out.println("Reverse: " + sum);

        if(sum == 1) {
            System.out.println("Not Prime");
        }
        else if(flag == 0) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}