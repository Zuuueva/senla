package Task;    

import java.security.SecureRandom;
import java.util.Scanner;

public class FirdTask {
    public static void main(String[] args) {
        System.out.println("Введите длину пароля от 8 до 12 символов:");
            Scanner s = new Scanner(System.in);
            //int length = s.nextInt();
        int choice = 0;
        
        if (s.hasNextInt()) {
            choice = s.nextInt();
            System.out.println("Спасибо! Вы ввели число " + choice);
            if(choice < 8 || choice > 12){
                System.out.println("К сожалению, такой позиции нет.");
                return;
            }
            else{
                String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>~)";
                SecureRandom rand = new SecureRandom();
                StringBuilder stringbuild = new StringBuilder();
                for (int i = 0; i < choice; i++)
                {
                    int randomIndex = rand.nextInt(characters.length());
                    stringbuild.append(characters.charAt(randomIndex));
                }
                System.out.println("Ваш пароль: " + stringbuild.toString());
            }
        } 
        else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            return;
        }
    }
}
