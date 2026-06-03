import java.util.Scanner;
public class sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total num:");
        int num=sc.nextInt();
        int sum[]=new int[num];

        int val,total=0;
        System.out.println("enter num:");
        for(int i=0;i<num;i++){
            sum[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            total=total+sum[i];
        }
        int add=0;
        for(int i=1;i<=num;i++){
            add=add+i;
        }
        int diff=add-total;
        System.out.println("difference:"+diff);
    }
}