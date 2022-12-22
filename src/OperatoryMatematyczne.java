//operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondnumber = 6;
        float thirdnumber = 4.0F;

        int addition = firstNumber + secondnumber; //10
        int subtraction = firstNumber - secondnumber; //-2
        int multiplication = firstNumber * secondnumber; //24
        float division = thirdnumber/secondnumber; //0,66
        int mod = secondnumber%firstNumber;//4 miesci sie w 6, 1,2

        System.out.println("Wynik dodawania: "+addition);
        System.out.println("Wynik odejmowania: "+subtraction);
        System.out.println("Wynik mnożenia: "+multiplication);
        System.out.println("Wynik dzielenia: "+division);
        System.out.println("Wynik modulo: "+mod);
    }
}
