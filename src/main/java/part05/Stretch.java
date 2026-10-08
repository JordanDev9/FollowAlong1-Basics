package part05;
import java.util.Random;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3546s
//        rewatch 59:06–61:29 for the Math methods, 64:54–68:28 for Random
// Guide: GUIDE.md in this folder, steps 2–6 and 12–16
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/*
THIS CODE WILL SAY 7 2.5 8 7.0 3 2 3.0 -3.0
 */
public class Stretch {
    public static void main(String[] args) {
        System.out.println(Math.max(7, -3));
        System.out.println(Math.min(2.5, 9));
        System.out.println(Math.abs(-8));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(-2.1));
        Random random = new Random();
        int x = random.nextInt(6)+1;
        System.out.println("You rolled a " + x );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = scanner.nextInt();
        double area = 3.14 * Math.pow(radius, 2);
        double areaR = Math.round(area);

        System.out.println("Area: " + area);
        System.out.println("Area Rounded: " + areaR);
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 6;
        int PD = ((4-1)*(4-1) + (6-2)*(6-2));
        double dis = Math.sqrt(PD);
        System.out.println("Distance: " + dis);


    }

}
