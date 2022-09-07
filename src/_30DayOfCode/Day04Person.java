package _30DayOfCode;

import java.util.Scanner;

public class Day04Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yası giriniz");
        int yas = scanner.nextInt();

        Day04Person person = new Day04Person(yas);
        System.out.println(person.ages());


    }

    private int age;

    public Day04Person(int initialAge) {

        if (initialAge < 0) {
            System.out.println("Age is not valid");
        }
        this.age = initialAge;
    }

    public int ages() {
        if (age > 0 && age < 13) {
            System.out.println("you are young");
        } else if (age > 13 && age < 18) {
            System.out.println("you are a teenager");
        } else {
            System.out.println("you are old");
        }
        return age;
    }

}


