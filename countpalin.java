import java.util.Scanner;
public class countpalin {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String word=sc.nextLine();
         int start=sc.nextInt();
         int end=sc.nextInt();
         String words=word.substring(start,end);
         String add=" ";
         int count=0;
         for(int i=words.length()-1;i>=0;i--){
                add+=words.charAt(i);
                count++;
         }
         if(count>5){
             System.out.println(count);
             System.out.println(add);
         }
         else{
             System.out.println("Not a palindrome");
         }  
    }
}
