import java.util.Scanner;
public class negeven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total numbers:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("enter numbers:");

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("negative even numbers:");
        for(int i=0;i<num;i++){
            if(arr[i]%2==0){
                System.out.println("-"+arr[i]);
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}