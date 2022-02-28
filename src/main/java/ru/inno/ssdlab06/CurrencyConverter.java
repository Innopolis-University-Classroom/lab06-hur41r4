// package ru.inno.ssdlab06;
import java.util.*;

public class CurrencyConverter {

  public static String getBaseCurrency() {
    System.out.print("Enter base currency: ");
    Scanner sc = new Scanner(System.in);

    return sc.nextLine();
  }

  public static String getTargetCurrency() {
    System.out.print("Enter target currency: ");
    Scanner sc = new Scanner(System.in);

    return sc.nextLine();
  }

  public static float getAmount() {
    System.out.print("Enter amount: ");
    Scanner sc = new Scanner(System.in);

    return sc.nextFloat();
  }

  public static float convertCurrency(String base, String target, float amount) {
    float res = 0;
    float rate = 110;
    return amount * rate;


    // if (base == "USD" && target == "RUB")
    // {
    //   rate = 110;
    //   res = amount * rate;
    // }

    // return res;
  }

  //TODO your code here
  public static void main(String[] args) {
    String b = getBaseCurrency();
    String t = getTargetCurrency();
    float a = getAmount();

    // System.out.print(b);
    // System.out.print(t);
    // System.out.print(a);

    System.out.println(convertCurrency(b, t, a));

  }
}
