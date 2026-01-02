package Chapter1;

import java.util.Scanner;

public class CheckSorted {
    void main() {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        boolean isSorted = true;

        for (int i=1; i<n; i++) {
            if (arr[i] < arr[i-1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
            System.out.println("Array Sorted");
        else
            System.out.println("Array is Not Sorted");
    }
}
