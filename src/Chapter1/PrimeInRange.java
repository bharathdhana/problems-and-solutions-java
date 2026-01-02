package Chapter1;

import java.util.Scanner;

public class PrimeInRange {
    void main() {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num =start; num<=end; num++) {
            if (num<=1)
                continue;

            boolean isPrime = true;

            for (int i=2; i*i<=num; i++) {
                if (num%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(num+ " ");
        }
    }
}
