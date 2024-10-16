package Task;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Калькулятор запустился.");
        var x = List.of("картошка", "ветер", "мука", "ёмкость", "нора");
        Random randomizer = new Random();
        String random = x.get(randomizer.nextInt(x.size()));
        var lives = 5;
        var guessed = 0;
        while(lives > 0 || guessed < x.size()){
            System.out.println("Введите букву:");
            Scanner s = new Scanner(System.in);
            char a = s.next().charAt(0);
            System.out.println("Вы ввели букву:" + a);
        }
        
    }

}