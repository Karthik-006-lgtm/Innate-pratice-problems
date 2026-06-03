import java.util.Scanner;

public class vowreplace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String vowels = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if("aeiouAEIOU".indexOf(ch) != -1) {
                vowels = ch + vowels;
            }
        }

        int j = 0;

        
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if("aeiouAEIOU".indexOf(ch) != -1) {

                System.out.print(vowels.charAt(j));
                j++;
            }
            else {
                System.out.print(ch);
            }
        }
    }
}