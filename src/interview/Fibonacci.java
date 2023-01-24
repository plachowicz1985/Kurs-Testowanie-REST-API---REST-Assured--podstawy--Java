package interview;

public class Fibonacci {
    public static void main(String[] args) {
         fibo(1);
         fibo(2);
         fibo(5);
         fibo(6);
         fibo(14);
         fibo(19);
    }

    //podajemy n jako parametr(ktory wyraz ciagu mamy wyswietlic)
    public static void fibo(int n) {
        //deklarujemy dwie zmienne
    long n1 = 1;
    long n2 = 1;

    //i ustawiamy na 3 poniewaz znamy dwa pierwsze wyrazy
    for (int i=3; i<=n; i++) {
        // tworzymy zmienna temp ktora przechowa nam sume dwoch poprzednich wyrazow
    long temp = n2+n1;
// nadpisujemy wartosc n1 i nadpisujemy mu wartosc n2
    n1=n2;
    //n2 bedzie wynosil temp
    n2 = temp;

    }

        System.out.println(n2);
    }
}
