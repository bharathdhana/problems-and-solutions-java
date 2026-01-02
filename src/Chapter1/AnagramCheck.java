package Chapter1;

import java.util.Scanner;

public class AnagramCheck {
    void main() {
        Scanner sc =new Scanner(System.in);

        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length())  {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[26];

        for (int i=0; i<str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int i=0; i<26; i++) {
            if (count[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
