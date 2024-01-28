import java.util.Scanner;

public class Main {

    public static void main(String Ags[]){

        int number = 29;
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }

    public static boolean isPrime(int n, int i) {

        if (n < 2) {
            return false;
        }

        if (i >= n / 2) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return isPrime(n, i + 1);
    }
}
