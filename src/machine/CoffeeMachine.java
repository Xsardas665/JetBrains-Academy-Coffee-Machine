package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final int waterPerCup = 200;
    private static final int milkPerCup = 50;
    private static final int coffeeBeansPerCup = 15;

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printSteps();
        askForCups();
    }

    private static void askForCups() {
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCups = scanner.nextInt();
        calculate(numberOfCups);
    }

    private static void calculate(int numberOfCups) {
        System.out.println("For " + numberOfCups + " cups of coffee you will need:");
        calculateWater(numberOfCups);
        calculateMilk(numberOfCups);
        calculateCoffeeBeans(numberOfCups);
    }

    private static void calculateCoffeeBeans(int numberOfCups) {
        int val = numberOfCups * coffeeBeansPerCup;
        System.out.println("" + val + "g of coffee beans");
    }

    private static void calculateMilk(int numberOfCups) {
        int val = numberOfCups * milkPerCup;
        System.out.println("" + val + " ml of milk");
    }

    private static void calculateWater(int numberOfCups) {
        int val = numberOfCups * waterPerCup;
        System.out.println("" + val + " ml of water");
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