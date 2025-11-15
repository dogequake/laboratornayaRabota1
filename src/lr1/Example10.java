package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        int yearBirth = in.nextInt();

        int currentYear = LocalDate.now().getYear(); //забираем текущий год.
        int age = currentYear - yearBirth;

        System.out.printf("Ваш возраст: %d", age);
        in.close();
    }
}
