package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we make the rover's variables together, here, and print them.
        // creates a string called rover that hold the value of "sting" which is a string
        String rover = "Sting";
        //creates a int caleld battery that holds the value of 87 which is a int
        int battery = 87;
        // creates a double called speed that holds the value 1.5 which is a double
        double speed = 1.5;
        // creates a char caleld mode that holds the value 'C' which is a char
        char mode = 'C';
        // create a boolean variable called lightson and hold the value of true boolean can only hold the value of true or false
        boolean lightson = true;
        System.out.println("Rover" + rover + " has " + battery +"% battery");
        System.out.println("Speed:" + speed + "m/s, mode " + mode +", lights on: " + lightson);
        System.out.println("After driving, battery is " + 75 +"%");
        /* Rover Sting has 87% battery.
        Speed: 1.5 m/s, mode C, lights on: true
        After driving, battery is 75%.
        */


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        // int needs to be float or double
        float fuel = 87.5f;
        // should be single quotes and not double qutoes
        char grade = 'C';
        // battery isnt defined using a capital b on a lowercase
        System.out.println(battery);

    }
}
