package _30DayOfCode;

import java.util.HashMap;
import java.util.Scanner;

public class Day08HashMaps {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> hasmap = new HashMap<String,Integer>();
        int personNumber = scanner.nextInt();

        for (int i = 0; i < personNumber; i++) {
            String name = scanner.next(); //String ifadeyi yazdıktan sonra nextLine() kullanırsan hata verir. çünkü bir alt satıra geçiyor.
            int phoneNumber = scanner.nextInt();
            hasmap.put(name,phoneNumber); //
        }
        while (scanner.hasNext()){ //
            String s = scanner.next();
            if(hasmap.containsKey(s)){ //containsKey() metodu ile hashmap içerisinde s değeri var mı diye kontrol ediyoruz.
                System.out.println(s + " =" + hasmap.get(s)); //get() metodu ile s değerine karşılık gelen değeri yazdırıyoruz.
            }else {
                System.out.println("not found");
            }
        }
    }
}
