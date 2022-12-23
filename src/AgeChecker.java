//zapytaj użytkownika o wiek, W przypadku gdy ma mniej niż 18 lat wypisz na ekranie informacje ze nie moze kupic
//alkoholu. Gdy ma iwecej niz 18 lat to podziekuj mu za zakupy.

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        if (age<18) {
            System.out.println("Jesteś za młody. Nie możesz kupić alkoholu");
        } else {
            System.out.println("Dziękujemy za zakupy. Pamiętaj alkohol szkodzi zdrowiu!");
        }


    }

}
