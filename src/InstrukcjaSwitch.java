public class InstrukcjaSwitch {
    public static void main(String[] args) {
        String danie = "Frytki";

        switch (danie) {
            case "Pizza" :
                System.out.println("Cena to 32 zł");
                break;
            case "Łosoś" :
                System.out.println("Cena to 52 zł");
                break;
            case "Frytki" :
                System.out.println("cena to 12 zł");
                break;
            default:
                System.out.println("Brak dania w menu");
        }
    }
}
