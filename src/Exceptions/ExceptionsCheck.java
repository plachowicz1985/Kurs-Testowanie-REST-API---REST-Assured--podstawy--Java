package Exceptions;

import drivers.NoValidBrowserName;

import java.util.Scanner;

public class ExceptionsCheck {
    //pobierz wiek od uzytkownika, jezeli bedzie mniejszy od 0 to wyrzuc wyjatek InvalidAgeExceptions
    //jezeli mamy 18>= to mozemy wypisac ze jestesmy pelnoletni

    public static void main(String[] args) throws NoValidBrowserName {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        if (age < 18 && age >= 0) {
            System.out.println("Jesteś za młody. Nie możesz kupić alkoholu");
        } else if (age < 0) {
            //System.out.println("Podaj poprawną wartość");
            throw new NoValidBrowserName("Wartość jest niepoprawna!");
        } else {
            System.out.println("Dziękujemy za zakupy. Pamiętaj alkohol szkodzi zdrowiu!");

        }
    }

}