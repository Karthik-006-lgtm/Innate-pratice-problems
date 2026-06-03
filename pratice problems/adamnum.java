import java.util.Scanner;
public class adamnum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numx=num*num;


        int sum=0;

        while(num!=0){
            int dig=num%10;
            sum=sum*10+dig;
            num=num/10;
        }
        if(sum!=0){
            sum=sum*sum;
        }
        int add=0;
        while(sum!=0){
            int digi=sum%10;
            add=add*10+digi;
            sum=sum/10;
        }

        if(add==numx){
            System.out.println("adam number");
        }
        else{
            System.out.println("no adam number");
        }
    }
}