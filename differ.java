import java.util.Scanner;
public class differ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w=sc.next();
        String x=sc.next();

        if(w.length()!=x.length()){
            System.out.println("No");
            return;
        }

        int count=0;
       
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)!=x.charAt(i)){
                count++;
            }
        }
        if(count==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
