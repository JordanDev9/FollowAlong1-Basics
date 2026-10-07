package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a Team?");
        String TeamOne = scanner.nextLine();
        System.out.println("Pick another Team?");
        String TeamTwo = scanner.nextLine();
        System.out.println("Pick a Week(1-18)");
        int Week = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pick a stadium?");
        String Stadium = scanner.nextLine();
        System.out.println("The " + TeamOne + " are playing the " + TeamTwo);
        System.out.println("The game of the the week in week " + Week + " is the " + TeamOne + " VS " + TeamTwo);
        System.out.println("The " + TeamOne + "and " + TeamTwo + " Wil play at " + Stadium +  " in week " + Week + " of the NFL Season");

        }
}
