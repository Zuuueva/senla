package Task;    

import java.security.SecureRandom;
import java.util.Scanner;

public class FirdTask {
    public static void main(String[] args) {
        System.out.println("Введите длину пароля от 8 до 12 символов:");
            Scanner s = new Scanner(System.in, "UTF-8");
            int length = s.nextInt();
        if (length >= 8 && length <= 12){
            final String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>~)";
            SecureRandom rand = new SecureRandom();
            StringBuilder stringbuild = new StringBuilder();
            for (int i = 0; i < length; i++)
            {
                int randomIndex = rand.nextInt(characters.length());
                stringbuild.append(characters.charAt(randomIndex));
            }
            System.out.println(stringbuild.toString());
    }
    }
}
