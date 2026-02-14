import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {

            String input = in.nextLine();

            // Regex to match repeated consecutive words
            String regex = "\\b(\\w+)\\b(\\s+\\1\\b)+";

            // Compile with case-insensitive flag
            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            Matcher m = p.matcher(input);

            // Replace repeated words with first occurrence
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            System.out.println(input);
        }

        in.close();
    }
}
