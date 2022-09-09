package _30DayOfCode;

import java.util.Scanner;

public class Day17MoreExceptions {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sayilar = scanner.nextInt();

        while (sayilar-- > 0) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Calculator calculator = new Calculator();

            try {
                int result = calculator.number(a, b);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class Calculator {

    int number(int x, int y) throws Exception {
        if (x < 0 || y < 0)
            throw new Exception("x veya y negatif olamaz"); // throw ile özel istisna fırlatıyoruz
        return (int) Math.pow(x, y);
    }
}

