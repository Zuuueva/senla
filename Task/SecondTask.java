package Task;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("1 Ruble");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("4 Yuan");
        System.out.println("5 Lyra");
        Scanner sc = new Scanner(System.in);
        System. out.println("Выберите валюту:");
        int choice = sc.nextInt();
        System.out.println("Введите сумму:");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                System.out.println(amount + " Ruble = " + (amount * 0.010282) + " Dollar");
                System.out.println(amount + " Ruble = " + (amount * 0.009426) + " Euro");
                System.out.println(amount + " Ruble = " + (amount * 0.073574) + " Yuan");
                System.out.println(amount + " Ruble = " + (amount * 0.351981) + " Lyra");
                break;
            case 2:
                System.out.println(amount + " Dollar = " + (amount * 97.26) + " Ruble");
                System.out.println(amount + " Dollar = " + (amount * 0.91745) + " Euro");
                System.out.println(amount + " Dollar = " + (amount * 7.11) + " Yuan");
                System.out.println(amount + " Dollar = " + (amount * 34.21) + " Lyra");
                break;
            case 3:
                System.out.println(amount + " Euro = " + (amount * 106.08) + " Ruble");
                System.out.println(amount + " Euro = " + (amount * 1.09) + " Dollar");
                System.out.println(amount + " Euro = " + (amount * 7.75) + " Yuan");
                System.out.println(amount + " Euro = " + (amount * 37.28) + " Lyra");
                break;
            case 4:
                System.out.println(amount + " Yuan = " + (amount * 13.59) + " Ruble");
                System.out.println(amount + " Yuan = " + (amount * 0.140607) + " Dollar");
                System.out.println(amount + " Yuan = " + (amount * 0.129) + " Euro");
                System.out.println(amount + " Yuan = " + (amount * 4.81) + " Lyra");
                break;
            case 5:
                System.out.println(amount + " Lyra = " + (amount * 2.84) + " Ruble");
                System.out.println(amount + " Lyra = " + (amount * 0.029234) + " Dollar");
                System.out.println(amount + " Lyra = " + (amount * 0.026821) + " Euro");
                System.out.println(amount + " Lyra = " + (amount * 0.207911) + " Yuan");
                break;
            default:
                System.out.println("Некорректное значение");
        }      
    }
}
