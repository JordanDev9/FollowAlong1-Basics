package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Swap {
    public static void main(String[] args) {
        // this assigns x to the string value of water
        String x = "water";
        // this assigns y to the string value of kool-aid
        String y = "Kool-Aid";
        // this creates a string called temp but it has not value yet
        String temp;
        // this assigns the value of temp to x
        temp = x;
        // this assigns the value of x to the value of y
        x = y;
        // this assigns the value of y to temp(which is the value of x before x became y)
        y = temp;
        // these two lines print out strings x: and y: then because the variables are not in quotes it prints out the value that they are holding
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

}
