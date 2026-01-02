package Chapter1;

import java.util.Scanner;

public class CountDigitsAndSumOfDigits {
    void main(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count  = 0;
        int sum =0;

        while (num!=0) {
            int digit = num%10;
            sum += digit;
            count++;
            num /= 10;
        }
        System.out.println("Digits Count: "+count);
        System.out.println("Sum of Digits: "+sum);
    }
}
