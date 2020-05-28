package machine;
import java.util.*;

public class CoffeeMachine {
    static int amountOfWater=400;
    static int amountOfMilk=540;
    static int amountOfCoffeBeans=120;
    static int amountOfDisposableCups=9;
    static int amountOfMoney=550;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            PerformAction(action);

        }

    }
    public static void PerformAction(String action){
        switch (action){
            case "buy": PerformBuy();
                        break;
            case "fill": PerformFill();
                         break;
            case "take": PerformTake();
                         break;
            case "remaining":PerformRemaining();
                             break;
            case "exit":System.exit(0);
                        break;
            default:break;
        }
    }
    public static void PerformBuy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String SelectCoffee = scanner.next();
        switch(SelectCoffee){
            case "1":EspressoValidation();
                    break;
            case "2":LatteValidation();
                    break;
            case "3":CappuccinoValidation();
                     break;
            case "back":break;
            default:break;
        }

    }
    public static void PerformFill(){
//        CoffeeMachine obj = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int AmountWater=scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int AmountMilk=scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int AmountCoffee=scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int AmountCups=scanner.nextInt();
        CoffeeMachine.amountOfWater+=AmountWater;
        CoffeeMachine.amountOfMilk+=AmountMilk;
        CoffeeMachine.amountOfCoffeBeans+=AmountCoffee;
        CoffeeMachine.amountOfDisposableCups+=AmountCups;

    }
    public static void PerformRemaining(){
//        CoffeeMachine obj =new CoffeeMachine();
        System.out.println("The coffee machine has:");
        System.out.println(CoffeeMachine.amountOfWater+" of water");
        System.out.println(CoffeeMachine.amountOfMilk+" of milk");
        System.out.println(CoffeeMachine.amountOfCoffeBeans+" of coffee beans");
        System.out.println(CoffeeMachine.amountOfDisposableCups+" of disposable cups");
        System.out.println("$"+CoffeeMachine.amountOfMoney+" of money");
    }
    public static void PerformTake(){
//        CoffeeMachine obj = new CoffeeMachine();
        System.out.println("I gave you $"+CoffeeMachine.amountOfMoney);
        CoffeeMachine.amountOfMoney=0;
    }
    public static void EspressoValidation(){
//        CoffeeMachine obj =new CoffeeMachine();
        int RequiredWater = 250;
        int RequiredCoffee = 16;
        int cost = 4;

        if(CoffeeMachine.amountOfWater>=RequiredWater&&CoffeeMachine.amountOfCoffeBeans>=RequiredCoffee&&CoffeeMachine.amountOfDisposableCups>0){
            System.out.println("I have enough resources, making you a coffee!");
            CoffeeMachine.amountOfCoffeBeans-=RequiredCoffee;
            CoffeeMachine.amountOfWater-=RequiredWater;
            CoffeeMachine.amountOfMoney+=cost;
            CoffeeMachine.amountOfDisposableCups-=1;
        }else{
            if(CoffeeMachine.amountOfWater<RequiredWater){
                System.out.println("Sorry, not enough water!");
            }else if(CoffeeMachine.amountOfCoffeBeans<RequiredCoffee){
                System.out.println("Sorry, not enough coffee beans!");
            }else{
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }public static void LatteValidation(){
//        CoffeeMachine obj =new CoffeeMachine();
        int RequiredWater = 350;
        int RequiredMilk = 75;
        int RequiredCoffee = 20;
        int cost = 7;

        if(CoffeeMachine.amountOfMilk>=RequiredMilk&&CoffeeMachine.amountOfWater>=RequiredWater&&CoffeeMachine.amountOfCoffeBeans>=RequiredCoffee&&CoffeeMachine.amountOfDisposableCups>0){
            System.out.println("I have enough resources, making you a coffee!");
            CoffeeMachine.amountOfCoffeBeans-=RequiredCoffee;
            CoffeeMachine.amountOfWater-=RequiredWater;
            CoffeeMachine.amountOfMilk-=RequiredMilk;
            CoffeeMachine.amountOfMoney+=cost;
            CoffeeMachine.amountOfDisposableCups-=1;
        }else{
            if(CoffeeMachine.amountOfWater<RequiredWater){
                System.out.println("Sorry, not enough water!");
            }else if(CoffeeMachine.amountOfCoffeBeans<RequiredCoffee){
                System.out.println("Sorry, not enough coffee beans!");
            }else if(CoffeeMachine.amountOfMilk<RequiredMilk){
                System.out.println("Sorry, not enough milk!");

            }else{
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }
    public static void CappuccinoValidation(){
//        CoffeeMachine obj =new CoffeeMachine();
        int RequiredWater = 200;
        int RequiredMilk = 100;
        int RequiredCoffee = 12;
        int cost = 6;

        if(CoffeeMachine.amountOfMilk>=RequiredMilk&&CoffeeMachine.amountOfWater>=RequiredWater&&CoffeeMachine.amountOfCoffeBeans>=RequiredCoffee&&CoffeeMachine.amountOfDisposableCups>0){
            System.out.println("I have enough resources, making you a coffee!");
            CoffeeMachine.amountOfCoffeBeans-=RequiredCoffee;
            CoffeeMachine.amountOfWater-=RequiredWater;
            CoffeeMachine.amountOfMilk-=RequiredMilk;
            CoffeeMachine.amountOfMoney+=cost;
            CoffeeMachine.amountOfDisposableCups-=1;
        }else{
            if(CoffeeMachine.amountOfWater<RequiredWater){
                System.out.println("Sorry, not enough water!");
            }else if(CoffeeMachine.amountOfCoffeBeans<RequiredCoffee){
                System.out.println("Sorry, not enough coffee beans!");
            }else if(CoffeeMachine.amountOfMilk<RequiredMilk){
                System.out.println("Sorry, not enough milk!");
            }else{
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

}
