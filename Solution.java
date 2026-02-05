import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // US
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // India (custom locale)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // China
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // France
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}