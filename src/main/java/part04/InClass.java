package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        rewatch 48:08–52:25 for + - * / % ++ and casting
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we do the pizza party math together, here.
        // this line assigns friends to the int value of 7
        int friends = 7;
        // this line assigns slicePer to the in value of 3
        int slicePer = 3;
        int PizzaTotal = 8;
        int slicesNeeded = friends * slicePer;
        int wholePizzas = slicesNeeded / PizzaTotal;
        int leftover = wholePizzas % slicesNeeded;
        double exactPizza = ((double)slicesNeeded / PizzaTotal);
        friends = friends + 1;
        System.out.println("A friend shows up. Friends: " + friends);
        System.out.println("Slices Needed: " + slicesNeeded + " Whole pizzas: " + wholePizzas + " Slices left over: " + leftover + " Exact pizzas: " + exactPizza);


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error (or the wrong output). Fix it. Run it. Then do the next line.
        // 4.0 isnt a int because of the decimal
        int share = 10 / 4;
        // need to isolate the addition or else 5 and 3 will be turned into string before they are added
        System.out.println("Total: " + (5 + 3));
        // totalSlices is not defined and your also dividing by zero
        System.out.println(slicesNeeded / (friends - friends));

    }
}
