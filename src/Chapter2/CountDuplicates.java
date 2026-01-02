package Chapter2;

import java.util.HashMap;

public class CountDuplicates {
    void main() {
        int[] arr = {1,2,2,3,4,4,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int duplicateCount = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                duplicateCount++;
                System.out.println("Duplicate element: " + key);
            }
        }
        System.out.println("Total Duplicate Elements: " + duplicateCount);
    }
}
