public class AutoTest {
    public static void main(String[] args) {
        //deklarujemy zmienną typu auto, a następnie obiekt tej klasy "new"
        Auto ford = new Auto("Ford", "Mustang", 1968, 12000);

        //przypisujemy wartosci pól naszego obiektu
//        mercedes.marka = "Mercedes";
//        mercedes.model = "Klasa S";
//        mercedes.rok = 2021;
//        mercedes.przebieg = 1000;

        //próbujemy wywowlac metody wewnatrz tego obiektu
        //jak przytrzymamy command (control w windowsie)
        // i najedziemy a nastepnie klikniemy na nazwę metody
        //to przeniesie nas do tej metody
//        ford.jedz();
//        ford.hamuj();
        ford.info();

        //tworzymy nową zmienną
        Auto audi = new Auto("Audi", "RS3", 2020, 5000);
//        audi.marka = "Audi";
//        audi.model = "A5";
//        audi.rok = 2020;
//        audi.przebieg = 0;

//        audi.jedz();
//        audi.hamuj();
        audi.info();

        //tworzymy nową zmienną. Zostaną wypisane domyślne wartości:
        // Null (dla typów obiektowych Integer) i 0 (dla typów prostych np int)
        Auto noName = new Auto();
////        noName.jedz();
////        noName.hamuj();
        noName.info();

    }
}
