package CoreJava;

import Utility.Util;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        System.out.println("please enter the year");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        Util ref = new Util();
        ref.leapyear(year);
        Parent p2 = new Parent();
        Employee e2 = new Employee();
        e2.animal(p2);
        e2.sum(2,3);
        System.out.println(e2.sum(2,3));
    }
}
