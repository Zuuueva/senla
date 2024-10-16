package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Игра Виселица началаѝь! У Вас есть 5 жизней.");
        
        var x = List.of("else", "live", "dog", "yoga");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int lives = 5;

        Random randomizer = new Random();
        String random = x.get(randomizer.nextInt(x.size()));
        //System.out.println(random);
        
        while(lives > 0 && arrayList.size() < x.size()){
            System.out.println("Введите букву:");
            Scanner s = new Scanner(System.in, "UTF-8");
            char a = s.next().charAt(0);
            String sc = "";
            
            if (random.indexOf(a) > -1){
                System.out.println("Угадали! Осталось " + lives + " жизней.");
                for(int k = 0; k < random.length(); k++){
                    if(a == random.charAt(k)){
                        arrayList.add(k);
                    }
                }      
            }
            else{
                lives--;
                System.out.println("Неверно! Осталось " + lives + " жизней.");
            }
            for(int t = 0; t < random.length(); t++){
                if (arrayList.contains(t)){
                    sc = sc + random.charAt(t);
                }
                else{
                    sc = sc + "_";
                }
            }
            System.out.println(sc);
        }
        
        System.out.println("Игра окончена!");
        if (lives == 0){ 
            System.out.println("Вы проиграли!");
        }
        else{
            System.out.println("Вы победили!");
        }
    }
}