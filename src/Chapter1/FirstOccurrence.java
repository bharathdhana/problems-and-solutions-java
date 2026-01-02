package Chapter1;

import java.util.Scanner;

public class FirstOccurrence {
    void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int low = 0;
        int high = n-1;
        int result = -1;

        while (low<=high) {
            int mid = low + (high-low)/2;

            if (arr[mid] == key) {
                result = mid;
                high = mid-1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (result != -1)
            System.out.println("First Occurrence at index: "+result);
        else
            System.out.println("Not Found");
    }
}
