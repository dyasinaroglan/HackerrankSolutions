package _30DayOfCode;

import java.util.Scanner;

public class Day03IntroToConditional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String result = "";

        if (num % 2 == 1) {
            result = "weird";
        } else {
            if (num >= 6 && num <= 20){
                result = "weird";
            }else {
                result = "not weird";
            }
        }
        System.out.println(result);
    }
}
