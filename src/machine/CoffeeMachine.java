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
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
        String action = scanner.nextLine();
        while(!(action.equals("exit"))) {
            if (action.equals("take")) {
                take();
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            }
            if (action.equals("fill")) {
                fill();
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            }
            if (action.equals("buy")) {
                buy();
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            }
            if (action.equals("remaining")) {
                printState();
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            }
            action = scanner.nextLine();
        }
    }

    private static void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String coffeeType = scanner.nextLine();
        switch (coffeeType){
            case "1":
                if (currentWater >= 250) {
                    if(currentBeans >= 16) {
                        if (currentCups >= 1) {
                            currentWater -= 250;
                            currentBeans -= 16;
                            currentMoney += 4;
                            currentCups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                        } else {
                            System.out.println("Sorry, not enough cups!");
                        }
                    } else {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "2":
                if (currentWater >= 350) {
                    if (currentMilk >= 75) {
                        if (currentBeans >= 20) {
                            if (currentCups >= 1) {
                                currentWater -= 350;
                                currentMilk -= 75;
                                currentBeans -= 20;
                                currentMoney += 7;
                                currentCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "3":
                if (currentWater >= 200) {
                    if (currentMilk >= 100) {
                        if (currentBeans >= 12) {
                            if (currentCups >= 1) {
                                currentWater -= 200;
                                currentMilk -= 100;
                                currentBeans -= 12;
                                currentMoney += 6;
                                currentCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "back":
                break;
        }
    }

    private static void take() {
        System.out.println("\nI gave you $" + currentMoney );
        currentMoney = 0;
    }

    private static void printState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println("" + currentWater + " of water");
        System.out.println("" + currentMilk + " of milk");
        System.out.println("" + currentBeans + " of coffee beans");
        System.out.println("" + currentCups + " of disposable cups");
        System.out.println("$" + currentMoney + " of money");
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