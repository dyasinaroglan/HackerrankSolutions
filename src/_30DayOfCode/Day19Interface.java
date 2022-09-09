package _30DayOfCode;

import java.util.Scanner;

public class Day19Interface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Advenced advenced = new Calculator2();
        int toplam = advenced.bölenToplami(n);

        System.out.println(advenced.getClass().getInterfaces()[0].getName());
        System.out.println(toplam);

    }
}


class Calculator2 implements Advenced {


    @Override
    public int bölenToplami(int bölünecekSayı) {
        if (bölünecekSayı == 1) return 1;
        int toplam = 1 + bölünecekSayı, kalan = 0;
        for (int bölüm = 2; bölüm < bölünecekSayı; bölünecekSayı++) {
            kalan = bölünecekSayı % bölüm;
            if (kalan == 0) {
                toplam = toplam + bölüm;
            }
        }
        return toplam;
    }
}

interface Advenced {
    int bölenToplami(int n);
}
