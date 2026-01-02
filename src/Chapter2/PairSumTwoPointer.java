package Chapter2;

import java.util.Arrays;

public class PairSumTwoPointer {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left=0;
        int right= arr.length-1;

        while (left<right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return false;
    }
    void main() {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(hasPairWithSum(arr, target));
    }
}
