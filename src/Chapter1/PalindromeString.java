package Chapter1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PalindromeString {
    void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed= "";

        for (int i=str.length()-1; i>=0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
