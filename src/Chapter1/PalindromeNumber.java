package Chapter1;

import java.util.Scanner;

public class PalindromeNumber {
    void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num!=0) {
            reverse = reverse * 10 + (num%10);
            num /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
