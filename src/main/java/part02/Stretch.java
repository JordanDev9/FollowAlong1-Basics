package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /* My guess
        7 7.0 a + b a: 7 "77" "14!" A true
         */
        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);
        String name = "Jordan Devonish";
        int age = 18;
        double Gpa = 3.0;
        boolean commuter = true;
        /* Name: Jordan Smith
        Age: 19
        GPA: 3.4
        Commuter: false
         */
        System.out.print("Name: " + name + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("GPA: " + Gpa + "\n");
        System.out.print("Commuter: " + commuter + "\n");
        /*J takes 4 classes in Computer Science, for 15.5 credit hours. Has a job: true
        char, int, double, boolean, String
         */
        char intial = 'J';
        int CA = 5;
        double CH = 15.5;
        boolean HJ = false;
        String major = "computer science";

        System.out.println(intial + " takes " + CA + " classes in " + major + ", for " + CH +  "credit hour. Has a job: " + HJ);


        // the s in string needs to be a S capital
        String city = "Dover";
        // you have to put l at the end
        long people = 4000000000l;
        // you need single quotes and not double quotes ''
        char grade = 'B';
        // you have to put f at the end because its a float
        float temp = 72.5f;
        System.out.println(city + " " + people + " " + grade + " " + temp);
    }
}
