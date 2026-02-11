package Task18;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Remove leading and trailing spaces
        s = s.trim();

        // If string is empty after trimming
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split using non-alphabet characters
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}
