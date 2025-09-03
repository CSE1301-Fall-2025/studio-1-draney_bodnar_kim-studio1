package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("What year?");
          double year = in.nextDouble();
          boolean math = (year%4 == 0 && year%100 != 0) || (year%400 ==  0);
          System.out.println(year + " is a leap year: " + math);



}
}
