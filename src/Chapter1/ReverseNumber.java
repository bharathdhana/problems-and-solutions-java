package Chapter1;

import java.util.Scanner;

public class ReverseNumber {
    void main(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = 0;

        while (num!=0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println(reverse);
    }
}
