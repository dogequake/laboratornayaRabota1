package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = in.nextLine();

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите отчество: ");
        String nameFather = in.nextLine();

        System.out.printf("Hello, %s %s %s", surname, name, nameFather);
        in.close();
    }
}
