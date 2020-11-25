package machine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {

    private static final int waterPerCup = 200;
    private static final int milkPerCup = 50;
    private static final int coffeeBeansPerCup = 15;

    private static int currentWater;
    private static int currentMilk;
    private static int currentBeans;
    private static int canMake;

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        askForIngredients();
    }

    private static void askForIngredients() {
        askForWater();
        askForMilk();
        askForBeans();
        calculate();
        askForCups();
    }

    private static void askForBeans() {
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        currentBeans = scanner.nextInt();
    }

    private static void askForMilk() {
        System.out.println("Write how many ml of milk the coffee machine has: ");
        currentMilk = scanner.nextInt();
    }

    private static void askForWater() {
        System.out.println("Write how many ml of water the coffee machine has: ");
        currentWater = scanner.nextInt();
    }

    private static void askForCups() {
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCups = scanner.nextInt();
        checkIfPossible(numberOfCups);
    }

    private static void checkIfPossible(int numberOfCups) {
        if (canMake == numberOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (canMake <= numberOfCups){
            System.out.println("No, I can make only " + canMake + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (canMake - numberOfCups) +" more than that)");
        }
    }

    private static void calculate() {
        int maxWater, maxMilk, maxBeans;
        maxWater = currentWater/waterPerCup;
        maxMilk = currentMilk/milkPerCup;
        maxBeans = currentBeans/coffeeBeansPerCup;
        List<Integer> set = Arrays.asList(maxBeans, maxMilk, maxWater);
        canMake = Collections.min(set);
    }
}