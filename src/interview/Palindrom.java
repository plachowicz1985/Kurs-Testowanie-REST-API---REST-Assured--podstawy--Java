package interview;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(isPalindrom("kamilślimak"));
    }

    public static boolean isPalindrom (String word) {
        //sprawdzamy ile znaków ma nasze słowo
        int n = word.length();
        //traktujemy naszego stringa jak tablicę
        for(int i=0; i<(n/2); i++ ) {

            //patrzymy czy wyraz znajdujacy sie na indeksie 0 jest rozny od znaku ktory znajduje sie na oststnim miejscu
            //jezeli jakas litera na poczatku nie bedzie rowna ostatniej, druga przedosttaniej itd
            //jezeli nie dostaniemy true przerywamy
        if(word.charAt(i) != word.charAt(n-i-1)) {
            return false;
        }

        }
        return true;
    }
}
