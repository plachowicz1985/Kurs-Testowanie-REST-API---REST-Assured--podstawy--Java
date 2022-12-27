import java.util.Scanner;

public class CalculatorTest {
//napisz program ktory poprosi uzytkownika o dwie liczby, a nastepnie wykona na nich podstawowe operacje matematyczne
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę, a następnie wciśnij ENTER");
    int firstNumber = scanner.nextInt();
    System.out.println("Podaj drugą liczbę, a następnie wciśnij ENTER");
    int secondNumber = scanner.nextInt();

    int addition = firstNumber + secondNumber;
    int subtraction = firstNumber - secondNumber;
    int multiplication = firstNumber * secondNumber;
    float division = firstNumber/secondNumber;
    int mod = secondNumber%firstNumber;

    System.out.println("Dodawanie: "+addition);
    System.out.println("Odejmowanie: "+subtraction);
    System.out.println("Mnożenie: "+multiplication);
    System.out.println("Dzielenie: "+division);
    System.out.println("Mdulo: "+mod);
//    int result = firstNumber*firstNumber;
//    System.out.println(result);

}
}

