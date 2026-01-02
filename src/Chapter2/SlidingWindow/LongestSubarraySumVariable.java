package Chapter2.SlidingWindow;

public class LongestSubarraySumVariable {
    public static int longestSubarray(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right=0; right<arr.length; right++) {
            sum += arr[right];

            while (sum>k) {
                sum -= arr[left++];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    void main() {
        int[] arr = {2,1,5,1,3,2};
        int k=7;
        System.out.println(longestSubarray(arr, k));
    }
}
