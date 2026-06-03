import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String content=str.toLowerCase();
        System.out.println("String lowercase: " + content);
        int count = 0;
        for (int i = 0; i < content.length(); i++) {
            char ch = content.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print("\ncharacter:" + ch + " ");
                count++;
            }
        }
        System.out.println("\nNumber of vowels: " + count);
        
    }
}
