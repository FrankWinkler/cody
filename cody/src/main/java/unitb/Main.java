package unitb;

public class Main {
    public static void main(String[] args) {
        //print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //string of alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int n = 63;
        //is n a prime number?
        boolean isPrime = true;

        //array of first 10 prime numbers
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        //check if n is a prime number

        String message = "hello world";
        //convert to byte array
        byte[] bytes = message.getBytes();


    }

    //method to check if n is a prime number
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
               isPrime = false;
               break;
            }
        }
        return isPrime;
    }
}