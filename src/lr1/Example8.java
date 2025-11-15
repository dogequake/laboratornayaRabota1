package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String dayWeek = in.nextLine();

        System.out.print("Введите название месяца: ");
        String mouthName = in.nextLine();

        System.out.print("Введите дату (номер дня в месяце): ");
        int dayNumMonth = in.nextInt();

        System.out.printf("Сегодняшняя дата: %s %d %s", dayWeek, dayNumMonth, mouthName);
        in.close();
    }
}
