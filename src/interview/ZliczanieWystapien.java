package interview;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {

    // int[] numbers = new int[] {1,2,3,2,5,3}
    public static void main(String[] args) {
        liczWystapienia(new int[] {1,2,3,2,5,3,5,6,7,7,1,8,8,9,11,11});

    }

    //tworzymy metodę statyczną, która jako parametr będzie przyjmowała
    //tablicę intów
    public static void liczWystapienia(int[] numbers) {
        //korzytsamy z mapy, która będzie zawierała klucz wartość - oba Integer
        Map<Integer, Integer> occurences = new HashMap<>();
        //interujemy wszystkie lementy, które znajdują się w tablicy
        //deklarujemy ze i jest mniejsze od dlugosci tablicy
        for (int i=0; i<numbers.length; i++) {
            //jeżeli nasza mapa zawiera klucz  z numbers o indeksie i
            if(occurences.containsKey(numbers[i])) {
                // to w takiej sytuacji chcemy pobrać wartość dla tego klucza
                Integer value = occurences.get(numbers[i]);
                // nastepnie chcemy te wartosc zaktualizowac, klucz sie nie bedzie zmienial,
                // bedziemy nadpisywali wartość i
                occurences.put(numbers[i], value+1);

                // w przypadku gdy nasza mapa nie zawiera takiego klucza to bedziemy chcieli dodac taka wartosc
                // jezeli go nie ma to bedzie jedna taka wartosc
            } else {
                occurences.put(numbers[i], 1);
            }
        }

        for (Integer key : occurences.keySet()) {
            System.out.println("Liczba " + key + " występuje " + occurences.get(key));
        }
        //System.out.println("Ilość elementów w mapie " + occurences.size());

    }
}
