package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
while (1 <= n) {
        if (!isPrime(n)) {
          System.out.println(n);
        }
        n--;
      }
  }

    public static boolean isPrime(int n) {
        int num = 2;
        while (n > num) {
        if (n % num == 0) {
          return true;
        }
        num++;
      }
        return false;
    }
}
