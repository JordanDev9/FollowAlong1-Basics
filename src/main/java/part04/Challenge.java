package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

import javax.swing.*;

public class Challenge {
    public static void main(String[] args) {
        int tipP = Integer.parseInt(JOptionPane.showInputDialog("Enter your tip%"));
        int people = Integer.parseInt(JOptionPane.showInputDialog("Enter your Amount of people"));
        double COM = Double.parseDouble(JOptionPane.showInputDialog("Enter your Cost of meal"));
        double tip = ((double)tipP * 0.01) * COM;
        COM = tip + COM;
        double ECOM = COM / people;
        int IECOM = (int)ECOM;
        int remain = (int)(double)COM % IECOM;
        System.out.printf("Tip: %.2f \n", tip);
        System.out.printf("Total: %.2f \n", COM);
        System.out.printf("Each person pays: %.2f \n", ECOM);
        System.out.println("If each person pays: " + IECOM +" Then you are " + remain + " short.");


    }

}
