import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int firstArray = -1, lastArray = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstArray == -1) firstArray = i;
                lastArray = i;
            }
        }
        
        return (firstArray == -1) ? new int[]{-1} : Arrays.copyOfRange(arr, firstArray, lastArray + 1);
    }
}