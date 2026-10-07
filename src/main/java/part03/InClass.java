package part03;
import java.util.Scanner;
// Type the Scanner import line here, on the empty line below.


// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        rewatch 35:40–38:50 for swapping, 39:25–47:00 for Scanner
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we ask for two team names together, here, and swap them.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the Home team?\n");
        String HomeTeam = scanner.nextLine();
        System.out.print("What is the Away team?\n");
        String AwayTeam = scanner.nextLine();
        System.out.println("Before: "  + HomeTeam + "" + AwayTeam);
        String swap;
        swap = HomeTeam;
        HomeTeam =  AwayTeam;
        AwayTeam = swap;
        System.out.println("After Halftime: " + HomeTeam + " " + AwayTeam);







        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        // I never defined home as home is did HomeTeam
        System.out.println("Home: " + HomeTeam);
        // scanner after new needs a capital S
        Scanner keyboard = new Scanner(System.in);
        // the string needs to be closed
        String coach = "Coach K";

    }
}
