public class LoopsCheck {
    //wypisz liczby z zakresu 1-100 podzielne przez 3
    //odwróc elementy tablicy [1,3,5, 7, 9] -> [9, 7, 5,3,1]
    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            if (i%3==0) {
//                System.out.println(i);
//            }
//        }

         int[] odwroconeNumery = new int[] {1, 3, 5, 7, 9};

//        for (int i = odwroconeNumery.length-1; i >= 0; i--) {
//            System.out.println(odwroconeNumery[i]);
//        }
            for (int i=0; i < (odwroconeNumery.length/2);i++) {
                int temp = odwroconeNumery[i];
                odwroconeNumery[i]=odwroconeNumery[odwroconeNumery.length-1-i];
                odwroconeNumery[odwroconeNumery.length-1-i] = temp;
                System.out.println("Interacja numer: " + i);
            }

            for (int i=0; i< odwroconeNumery.length;i++) {
                System.out.println(odwroconeNumery[i]);
            }

    }
}
