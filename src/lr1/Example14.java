package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        int previousNum = num - 1;
        int nextNum = num + 1;

        int sum = previousNum + num + nextNum;
        int squareSum = sum * sum;

        System.out.println(previousNum + " " + num + " " + nextNum + " " + squareSum);

        in.close();
    }
}
