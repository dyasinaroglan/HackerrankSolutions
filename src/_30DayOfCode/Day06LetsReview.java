package _30DayOfCode;

import java.util.Scanner;

public class Day06LetsReview {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();  //kaç tane ifade gireceğiz
        scanner.nextLine(); // fazladan satır atlamasını önlemek için
        String str1 = "", str2 = "";
        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            char[] char1 = input.toCharArray(); //girilen String ifadeyi char array'e çeviriyoruz
            for (int j = 0; j < char1.length; j++) { //tek tek char array'in elemanlarına bakıyoruz
                if (j % 2 == 0) { // eğer index çift ise
                    str1 = str1 + char1[j]; //boş olan str1'e char array'in elemanını ekliyoruz
                } else {
                    str2 = str2 + char1[j]; // değilse

                }
            }
            System.out.println("str1 : " + str1  + " " + "str2 : " + str2);
            str1 = str2 = ""; //str1 ve str2'yi boşaltıyoruz, boşaltmazsak üstüne yazar
        }
    }
}
