package _30DayOfCode;

import java.util.Scanner;

public class Day07Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();

        int[] array = new int[nums]; //Array oluşturduk ve bunun uzunluğu girdiğimiz rakam kadar olacak dedik
        
        //şimdi bu rakam kadar sayıyı for döngüsü ile yazacağız
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i] + " ");

        }
    }
}
