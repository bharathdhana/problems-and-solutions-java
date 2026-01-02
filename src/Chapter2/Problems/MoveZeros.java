package Chapter2.Problems;

import java.util.Arrays;

public class MoveZeros {
    void main() {
        int[] arr= {0,1,0,3,12};
        int index= 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[index++]=arr[i];
            }
        }
        while (index<arr.length) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
