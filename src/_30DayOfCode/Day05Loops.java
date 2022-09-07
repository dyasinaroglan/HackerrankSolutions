package _30DayOfCode;

import java.util.Scanner;

public class Day05Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int num = scanner.nextInt();


        for (int i = 1; i <= 10; i++){
            int result = num*i;
            System.out.println(num + " X " + i + " = " + result);
        }
        System.out.println();
    }
}
