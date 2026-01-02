package Chapter2.SlidingWindow;

public class MaxSumSubarrayFixed {
    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<k; i++) {
            windowSum += arr[i];
        }
        maxSum= windowSum;

        for(int i=k; i<arr.length; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    void main() {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }
}
