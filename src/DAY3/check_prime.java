package DAY3;

import java.util.Scanner;

public class check_prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        while (i < num) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }

            i++;
        }

        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("Not a Prime");
        }

        sc.close();
    }
}