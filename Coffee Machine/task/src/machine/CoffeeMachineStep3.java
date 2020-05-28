package machine;

import java.util.Scanner;

public class CoffeeMachineStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int numberOfCups = scanner.nextInt();
        if(cupsOfCoffeePossible(water,milk,coffeeBeans)==numberOfCups){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(cupsOfCoffeePossible(water,milk,coffeeBeans)<numberOfCups){
            System.out.println("No, I can make only "+cupsOfCoffeePossible(water,milk,coffeeBeans)+" cup(s) of coffee");
        }else{
            System.out.println("Yes, I can make that amount of coffee (and even "+(numberOfCups-cupsOfCoffeePossible(water,milk,coffeeBeans))+" more than that)");
        }

    }
    public static int cupsOfCoffeePossible(int water,int milk,int coffeeBeans){
        int CupsWithWater=water/200;
        int CupsWithMilk=milk/50;
        int CupsWithCoffee=coffeeBeans/15;

        if(CupsWithWater<=CupsWithMilk&&CupsWithWater<=CupsWithCoffee){
            return CupsWithWater;
        }else if(CupsWithMilk<=CupsWithWater&&CupsWithMilk<=CupsWithCoffee){
            return CupsWithMilk;
        }
        return CupsWithCoffee;
    }
}
