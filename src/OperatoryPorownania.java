public class OperatoryPorownania {
    //porownuja elementy rownania i zwracaja wartosc logiczna true albo false
    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = secondNumber>firstNumber;
        System.out.println(result);
        System.out.println(firstNumber>secondNumber); //false
        System.out.println(firstNumber<secondNumber); //true
        System.out.println(firstNumber>=secondNumber);//false
        System.out.println(firstNumber<=secondNumber);//true
        System.out.println(firstNumber==secondNumber);//false
        System.out.println(firstNumber!=secondNumber);//true


    }
}
