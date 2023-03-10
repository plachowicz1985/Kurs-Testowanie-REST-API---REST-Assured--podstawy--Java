//stórz 3 obiekty klasy student. Przypisz wartości do pól i dodaj studentów do tablicy.
//dla kazdego studenta wywolac metody z klasy student - przedstaw sie itd.
//1. Tworzymy 3 obiekty klasy student
//2. przypisujemy wartości
//3. tworzyy tablice
//4. Dodajemy studentow so tablicy i wywolujemy 4 metody z klasy student

public class StudentChecker {

    public static void main(String[] args) {

        //pole nazwauczelni jest statyczne czyli charakterystyczne dla klasy, nie jest powiązane z konkretnym obiektem,
        //nie jest unikalne dla każdego obiektu.
        //Obiekt danej klasy będzie miał dostę do pól statycznych. Pole statyczne jest współdzielone przez wszystkie obiekty
        //danej klasy

        //Metoda statyczny jest również charakterystyczna dla klasy, a nie dla konkretnego obiektu danej klasy.
        //Nie musimy tworzyc obiektu danej klasy aby wywolac tę metodę - metodę statyczną(infouczelnia)
        String uczelnia = Student.nazwauczelni;
        Student.infoUczelnia();

        Student student1 = new Student();
        student1.imie = "Piotr";
        student1.nazwisko = "Lachowicz";
        student1.nick = "PioL";
        student1.email = "PioL@wp.pl";
        student1.numerIndeksu = "1/2022";
        String uczelniaStudenta1 = student1.nazwauczelni;
        student1.infoUczelnia();

        Student student2 = new Student();
        student2.imie = "Paweł";
        student2.nazwisko = "Kryszalowicz";
        student2.nick = "KryP";
        student2.email = "KryP@wp.pl";
        student2.numerIndeksu = "2/2022";

        Student student3 = new Student();
        student3.imie = "Sebastian";
        student3.nazwisko = "Mila";
        student3.nick = "MilS";
        student3.email = "MilS@wp.pl";
        student3.numerIndeksu = "3/2022";

        //w tablicy najpierw typ danych
        Student[] studenci = new Student[] {student1, student2, student3};

        for (int i = 0; i < studenci.length; i++) {
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajEmail();
            studenci[i].podajNumerIndeksu();
            System.out.println();
        }

        String imie;
    }
}
