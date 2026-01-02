package Chapter1;

import java.util.Scanner;

public class LinearSearch {
    void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not Found");
    }
}