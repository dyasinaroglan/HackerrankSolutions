package _30DayOfCode;

import java.util.Scanner;

public class Day01DataTypes {
    public static void main(String[] args) {

        int i = 5;
        double d = 5.5;
        String s = "Hello World ";

        Scanner scanner = new Scanner(System.in);

        int i2 = scanner.nextInt();
        scanner.nextInt();
        double d2 = scanner.nextDouble();
        scanner.nextInt();
        String s2 = scanner.nextLine();
        scanner.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scanner.close();
    }
}
