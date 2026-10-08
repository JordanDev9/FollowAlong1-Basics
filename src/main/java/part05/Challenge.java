package part05;
import java.util.Scanner;
import java.util.Random;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int x = random.nextInt(6)+1;
        int y = random.nextInt(6)+1;
        int b = x + y;
        double ave = b / 2.0;
        System.out.println("your name is " + name + "\n" + name + "rolled a " + x + " and a " + y + "\nTotal:  " + b);
        System.out.println("Higher die: " + Math.max(x, y));
        System.out.println("Lower die: " + Math.min(x, y));
        System.out.println("Difference: " + Math.abs(x-y));
        System.out.println("Average: " + ave);
        System.out.println("Average, Rounded: " + Math.round(ave));







    }

}
