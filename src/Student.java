public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public String numerIndeksu;

    public static String nazwauczelni = "AGH po zmianie";

    //metoda
    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguję się za pomocą " + nick);
    }

    public void podajNumerIndeksu() {
        System.out.println("Mój numer indeksu to: "+numerIndeksu);
    }

    public void podajEmail() {
        System.out.println("Mój email to: " + email);
    }

    //jeżeli mamy metodę statyczną to wewnatrz tej metody mozemy sie odwolywac do pól,
    // ktore rowniez są statyczne (czyli charakterystyczne dla klasy) lub mozemy wewnatrz tej metody wywolywac inne metody,
    //ale te metody rownie musza byc statyczne
    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to " + nazwauczelni);
        drugaMetoda();
    }

    public static void drugaMetoda () {
        System.out.println("Jestem drugą metodą");
    }
}
