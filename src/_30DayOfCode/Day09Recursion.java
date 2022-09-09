package _30DayOfCode;

import java.util.Scanner;

public class Day09Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(factoriel(i));

    }
    public static int factoriel(int sayı) {

        if (sayı == 1 || sayı == 0) {
            return 1;
        } else {
            return sayı * factoriel(sayı - 1);
        }
    }
}
