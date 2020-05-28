package machine;

import java.util.Scanner;

public class CoffeeMachineStep4 {
    public static void main(String[] args) {
        int amountOfWater=400;
        int amountOfMilk=540;
        int amountOfCoffeBeans=120;
        int amountOfDisposableCups=9;
        int amountOfMoney=550;
        Scanner scanner = new Scanner(System.in);


        printIngredients(amountOfWater,amountOfMilk,amountOfCoffeBeans,amountOfDisposableCups,amountOfMoney);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        switch (action){
            case "buy":buyAction();
                break;
            case "fill":fillAction();
                break;
            case "take":takeAction();
                break;
            default:
                break;
        }

    }
    public static void printIngredients(
            int amountOfWater,
            int amountOfMilk,
            int amountOfCoffeBeans,
            int amountOfDisposableCups,
            int amountOfMoney){
        System.out.println("The coffee machine has:");
        System.out.println(amountOfWater+" of water");
        System.out.println(amountOfMilk+" of milk");
        System.out.println(amountOfCoffeBeans+" of coffee beans");
        System.out.println(amountOfDisposableCups+" of disposable cups");
        System.out.println(amountOfMoney+" of money");

    }
    public static void buyAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int CoffeeType= scanner.nextInt();
        switch (CoffeeType){
            case 1:
                printIngredients(400-250,540,120-16,9-1,550+4);
                break;
            case 2:
                printIngredients(400-350,540-75,120-20,9-1,550+7);
                break;
            case 3:
                printIngredients(400-200,540-100,120-12,9-1,550+6);
                break;
        }


    }

    public static void fillAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int AmountWater=scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int AmountMilk=scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int AmountCoffee=scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int AmountCups=scanner.nextInt();
        int amountOfWater=400+AmountWater;
        int amountOfMilk=540+AmountMilk;
        int amountOfCoffeBeans=120+AmountCoffee;
        int amountOfDisposableCups=9+AmountCups;
        printIngredients(amountOfWater,amountOfMilk,amountOfCoffeBeans,amountOfDisposableCups,550);


    }
    public static void takeAction(){
        System.out.println("I gave you $"+550);
        printIngredients(400,540,120,9,0);

    }

}
