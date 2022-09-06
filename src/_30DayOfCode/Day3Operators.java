package _30DayOfCode;

import java.util.Scanner;

public class Day3Operators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mealCost = scanner.nextInt();
        double tipPercent = scanner.nextDouble();
        double taxPercent = scanner.nextDouble();

        double totalCost = mealCost + (mealCost * tipPercent) / 100 + (mealCost * taxPercent) / 100;

        int totalCostInt = (int) Math.round(totalCost); // double ifadeyi eğer sonuç pozitifse en büyük tam sayıya tamamlar.
        // double ifadeyi eğer sonuç negatifse en küçük tam sayıya tamamlar.
        System.out.println("The total meal cost is " + totalCostInt + " dollars.");
    }
}
