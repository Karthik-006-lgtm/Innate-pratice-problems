import java.util.Scanner;
public class count {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int max = 0;

        for(int i = 0; i < word.length(); i++) {

            String temp = "";

            for(int j = i; j < word.length(); j++) {

                char ch = word.charAt(j);

                if(temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                if(temp.length() > max) {
                    max = temp.length();
                }
            }
        }

        System.out.println(max);
    }
}
