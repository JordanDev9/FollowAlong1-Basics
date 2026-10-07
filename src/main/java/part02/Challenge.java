package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION D — Challenge. A video game character card. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/*
String, int, long, double, float, boolean, char.
String: Jordan Devoinsh int: 18 long: 3000000 double: 94.5 boolean: true char: S
 */
public class Challenge {
    public static void main(String[] args){
        String name = "Jordan Devonish";
        int gamesWon = 18;
        long legacyScore = 3000000l;
        double winPercentage = 94.5;
        boolean Champion = true;
        char tier = 'S';

        System.out.println("===== CHARACTER CARD =====");
        System.out.println("Name: \t" + name);
        System.out.println("Games won: \t" + gamesWon);
        System.out.println("Legacy Score: \t" + legacyScore);
        System.out.println("Win percentage: \t" + winPercentage);
        System.out.println("Champion?: \t" + Champion);
        System.out.println("Tier: \t" + tier);


    }

}
