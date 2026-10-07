package part03;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

public class UserInput {
    public static void main(String[] args) {
        // this line creates a scanner and turns it on?
        Scanner scanner = new Scanner(System.in);
        // this line ask for user input what is your name
        System.out.println("What is your name?");
        // this line takes the user input and assigns it to the varibale name
        String name = scanner.nextLine();
        // this line take string Hello and adds it to name creating Hello whatever the name input is
        System.out.println("Hello " + name);
        // this line ask for a user input how old are you?
        System.out.println("How old are you?");
        // this line take the int and assigns it to the variable age
        int age = scanner.nextInt();
        // this line prevents the scanner from not calling the other inputs
        scanner.nextLine();
        // the line prints string you are variable age and sting years old
        System.out.println("You are " + age + " years old");
        // this line of code ask for a user input what is your favorite food
        System.out.println("What is your favorite food?");
        // this line takes the user input and assigns it to the variable food
        String food = scanner.nextLine();
        // this line prints string you like and add the variable food which prints the value of the variable which would be whatever the user input is
        System.out.println("You like " + food);

    }
}
