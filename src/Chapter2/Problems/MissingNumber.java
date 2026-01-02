package Chapter2.Problems;

public class MissingNumber {
    void main() {
        int[] arr = {1,2,4,5,6};
        int n=6;

        int expectedSum = n*(n+1)/2;
        int actualSum =0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum-actualSum;
        System.out.println("Missing Number: "+missingNumber);
    }
}
