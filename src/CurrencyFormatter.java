import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en" , "IN");
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        // Write your code here.

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}