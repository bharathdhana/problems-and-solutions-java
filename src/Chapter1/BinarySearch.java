package Chapter1;

import java.util.Scanner;

public class BinarySearch {
    void main() {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int low = 0;
        int high = n-1;
        int index = -1;

        while (low<=high) {
            int mid = low + (high-low) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1)
            System.out.println("Found at index: "+index);
        else
            System.out.println("Not Found");
    }
}
