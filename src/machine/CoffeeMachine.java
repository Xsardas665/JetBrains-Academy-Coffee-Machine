package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int currentWater = 400;
    private static int currentMilk = 540;
    private static int currentBeans = 120;
    private static int currentCups = 9;
    private static int currentMoney = 550;

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printState();
        String action = scanner.nextLine();
        if (action.equals("take")) {
            take();
        }
        if (action.equals("fill")) {
            fill();
        }
        if (action.equals("buy")) {
            buy();
        }
        printState();
    }

    private static void buy() {
        int coffeeType = scanner.nextInt();
        switch (coffeeType){
            case 1:
                currentWater -= 250;
                currentBeans -= 16;
                currentMoney += 4;
                break;
            case 2:
                currentWater -= 350;
                currentMilk -= 75;
                currentBeans -= 20;
                currentMoney += 7;
                break;
            case 3:
                currentWater -= 200;
                currentMilk -= 100;
                currentBeans -= 12;
                currentMoney += 6;
                break;
        }
        currentCups -= 1;
    }

    private static void take() {
        System.out.println("I gave you " + currentMoney );
        currentMoney = 0;
    }

    private static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println("" + currentWater + " of water");
        System.out.println("" + currentMilk + " of milk");
        System.out.println("" + currentBeans + " of coffee beans");
        System.out.println("" + currentCups + " of disposable cups");
        System.out.println("" + currentMoney + " of money");
    }

    private static void fill() {
        askForWater();
        askForMilk();
        askForBeans();
        askForCups();
    }

    private static void askForBeans() {
        System.out.println("Write how many grams of coffee beans do you want to add:");
        currentBeans += scanner.nextInt();
    }

    private static void askForMilk() {
        System.out.println("Write how many ml of milk do you want to add:");
        currentMilk += scanner.nextInt();
    }

    private static void askForWater() {
        System.out.println("Write how many ml of water do you want to add:");
        currentWater += scanner.nextInt();
    }

    private static void askForCups() {
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        currentCups += scanner.nextInt();
    }
}