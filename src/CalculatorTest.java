import java.util.Scanner;

public class CalculatorTest {
//napisz program ktory poprosi uzytkownika o dwie liczby, a nastepnie wykona na nich podstawowe operacje matematyczne
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę, a następnie wciśnij ENTER");
    int firstNumber = scanner.nextInt();
    System.out.println("Podaj drugą liczbę, a następnie wciśnij ENTER");
    int secondNumber = scanner.nextInt();

    Calculator calculator = new Calculator();
    int dodawanie = calculator.addition(firstNumber, secondNumber);
    int odejmowanie = calculator.substraction(firstNumber, secondNumber);
    int mnozenie = calculator.multiplication(firstNumber, secondNumber);
    int dzielenie = calculator.division(firstNumber, secondNumber);
    int modulo = calculator.mod(firstNumber, secondNumber);


//    int addition = firstNumber + secondNumber;
//    int subtraction = firstNumber - secondNumber;
//    int multiplication = firstNumber * secondNumber;
//    float division = firstNumber/secondNumber;
//    int mod = secondNumber%firstNumber;

    System.out.println("Dodawanie: "+dodawanie);
    System.out.println("Odejmowanie: "+odejmowanie);
    System.out.println("Mnożenie: "+mnozenie);
    System.out.println("Dzielenie: "+dzielenie);
    System.out.println("Mdulo: "+modulo);
//    int result = firstNumber*firstNumber;
//    System.out.println(result);

}
}

