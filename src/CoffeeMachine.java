package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int hasWater = 400;
    private static int hasMilk = 540;
    private static int hasBeans = 120;
    private static int plasticCups = 9;
    private static int hasMoney = 550;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        while (scanner.hasNext()){
            String choice = scanner.next();
            switch (choice) {
                case "remaining":
                    remaining();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    break;
                case "buy":
                    buy();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    break;
                case "fill":
                    fill();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    break;
                case "take":
                    take();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }
        System.out.println();
    }

    private static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(hasWater + " of water");
        System.out.println(hasMilk + " of milk");
        System.out.println(hasBeans + " of coffee beans");
        System.out.println(plasticCups + " of disposable cups");
        System.out.println("$" + hasMoney + " of money");
        System.out.println();
    }

    private static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String whichCoffee = scanner.next();
         switch (whichCoffee) {
            case "1":
                if (hasWater >= 250 && hasBeans >= 16 && plasticCups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    hasWater = hasWater - 250;
                    hasBeans = hasBeans - 16;
                    plasticCups = plasticCups - 1;
                    hasMoney = hasMoney + 4;
                } else if (hasWater < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (hasBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (plasticCups < 1){
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "2":
                if (hasWater >= 350 && hasMilk>= 75 && hasBeans >= 20 && plasticCups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    hasWater = hasWater - 350;
                    hasMilk = hasMilk - 75;
                    hasBeans = hasBeans - 20;
                    plasticCups = plasticCups - 1;
                    hasMoney = hasMoney + 7;
                } else if (hasWater < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (hasMilk < 75){
                    System.out.println("Sorry, not enough milk!");
                } else if (hasBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (plasticCups < 1){
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "3":
                if (hasWater >= 200 && hasMilk>= 100 && hasBeans >= 12 && plasticCups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    hasWater = hasWater - 200;
                    hasMilk = hasMilk - 100;
                    hasBeans = hasBeans - 12;
                    plasticCups = plasticCups - 1;
                    hasMoney = hasMoney + 6;
                } else if (hasWater < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (hasMilk < 100){
                    System.out.println("Sorry, not enough milk!");
                } else if (hasBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (plasticCups < 1){
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "back":
                break;

        }
        System.out.println();
    }
    private static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        hasWater = scanner.nextInt() + hasWater;
        System.out.println("Write how many ml of milk do you want to add:");
        hasMilk = scanner.nextInt() + hasMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        hasBeans = scanner.nextInt() + hasBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        plasticCups = scanner.nextInt() + plasticCups;
        System.out.println();
    }

    private static void take() {
        System.out.println("I gave you $" + hasMoney);
        hasMoney = 0;
        System.out.println();
    }

}

