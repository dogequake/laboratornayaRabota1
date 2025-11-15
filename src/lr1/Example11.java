package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите год рождения: ");
        int yearBirth = in.nextInt();

        int currentYear = LocalDate.now().getYear(); //забираем текущий год.
        int age = currentYear - yearBirth;

        System.out.printf("Ваше имя %s, ваш возраст %d", name, age);
        in.close();
    }
}
