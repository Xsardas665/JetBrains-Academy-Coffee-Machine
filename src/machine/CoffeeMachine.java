package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        printSteps();
    }

    private static void printSteps() {
        String steps = "Starting to make a coffee\n" +
                       "Grinding coffee beans\n" +
                       "Boiling water\n" +
                       "Mixing boiled water with crushed coffee beans\n" +
                       "Pouring coffee into the cup\n" +
                       "Pouring some milk into the cup\n" +
                       "Coffee is ready!";
        System.out.println(steps);
    }
}