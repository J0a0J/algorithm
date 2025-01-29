import java.math.BigInteger;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int diff = 1;
        int[] arr = {a, b, c};
        
        if (arr[0] == arr[1]) diff++;
        if (arr[1] == arr[2]) diff++;
        if (arr[0] == arr[2]) diff++;
        
        if (diff == 4) diff = 3;
        
        for (int i = 1; i <= diff; i++) {
            answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
        }
        
        return answer;
    }
}