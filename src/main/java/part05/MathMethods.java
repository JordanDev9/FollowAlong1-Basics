package part05;
import java.util.Scanner;
import java.util.Random;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class MathMethods {
    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -10;
//        double a = 42;
//        double b = 4;
//        double z = Math.min(x, y);
//        System.out.println(z);
//        double Z = Math.max(x, y);
//        System.out.println(Z);
//        a = Math.abs(a);
//        System.out.println(a);
//        double B = Math.sqrt(b);
//        System.out.println(B);
//        z = Math.round(x);
//        System.out.println(z);
//        z = Math.ceil(x);
//        System.out.println(z);
//        z = Math.floor(x);
//        System.out.println(z);
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter side x: ");
        //x = scanner.nextDouble();
        //System.out.println("Enter side y: ");
        //y = scanner.nextDouble();
        //z = Math.sqrt((x * x) + (y * y));
        //System.out.println("The hypotenuse is: " + z);
        //scanner.close();
        Random random = new Random();
        int X = random.nextInt(6)+1;
        System.out.println(X);
        double Y = random.nextDouble();
        System.out.println(Y);
        boolean Z = random.nextBoolean();
        System.out.println(Z);
    }
}
