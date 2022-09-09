package _30DayOfCode;

import java.util.Scanner;

public class Day16ExceptionString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int i = 0;

        try {
            i = Integer.parseInt(str);
            System.out.println(i); //hata verir
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }

    }
}
