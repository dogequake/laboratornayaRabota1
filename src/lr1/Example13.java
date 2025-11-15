package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = in.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = in.nextInt();

        int sum = firstNum + secondNum;

        System.out.printf("Сумма чисел: %d", sum);
        in.close();
    }
}
