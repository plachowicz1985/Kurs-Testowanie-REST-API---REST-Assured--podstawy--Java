public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
//        metody.pobierzWynik();
//        int result = metody.pobierzWynik();
//        int result2 = result*2;
//        System.out.println("Rezultat po mnożeniu to: "+result2+", a przed mnożeniem to: "+result);

//        metody.policzWynikParam(2);
//        metody.policzWynikParam(100);
//        metody.policzWynikParam(23);

        int result = metody.add(2,3, "Wypisane słowo");
        System.out.println(result);
        System.out.println(metody.add(2,6, "Wypisz, wymaluj"));
    }


}
