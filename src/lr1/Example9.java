package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String mouthName = in.nextLine();

        System.out.print("Введите количество дней в этом месяце: ");
        int numDaysMonth = in.nextInt();

        System.out.printf("%s содержит %d дней ", mouthName, numDaysMonth);
        in.close();
    }
}
