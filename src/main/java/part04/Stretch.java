package part04;

import java.sql.SQLOutput;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/*
this code will print 2 2.5 11 9 3.5 6
*/
public class Stretch {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n / 4);
        System.out.println(n % 4);
        System.out.println(n / 4.0);
        n++;
        System.out.println(n);
        n--;
        n--;
        System.out.println(n);
        System.out.println((double) 7 / 2);
        System.out.println(7 / 2 * 2);
        int people = 4;
        double bill = 50.00;
        double EP = bill / people;
        System.out.println("Each person pays " + EP);
        int seconds = 500;
        int minutes = seconds / 60;
        int leftOver = seconds % 60;
        System.out.println(seconds + " Seconds is " + minutes + " minutes and " + leftOver + " seconds");
        int t1 = 90;
        int t2 = 85;
        int t3 = 78;
        int TS = t1 + t2 + t3;
        int TSA = TS/3;
        double TDA = TS/3.0;
        System.out.println("Int Average: " + TSA);
        System.out.println("Double Average: " + TDA);



    }

}
