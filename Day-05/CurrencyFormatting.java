import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        // Locales
        Locale us = Locale.US;
        Locale india = new Locale("en", "IN");   // custom locale
        Locale china = Locale.CHINA;
        Locale france = Locale.FRANCE;

        // Currency formatters
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);

        // Formatting
        String usCurrency = usFormat.format(payment);
        String indiaCurrency = indiaFormat.format(payment);
        String chinaCurrency = chinaFormat.format(payment);
        String franceCurrency = franceFormat.format(payment);
        
        System.out.println("US: " + usCurrency);
        System.out.println("India: " + indiaCurrency);
        System.out.println("China: " + chinaCurrency);
        System.out.println("France: " + franceCurrency);
    }
}