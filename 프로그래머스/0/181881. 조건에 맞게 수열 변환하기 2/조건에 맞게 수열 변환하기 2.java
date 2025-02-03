import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] tmp = new int[arr.length];
        
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                int a = arr[i];
                if (a >= 50 && a % 2 == 0) {
                    tmp[i] = a / 2;
                } else if (a < 50 && a % 2 != 0) {
                    tmp[i] = a * 2 + 1;
                } else { tmp[i] = a; }
            } 

            if (Arrays.equals(tmp, arr)) break;
            
            answer++;
            arr = tmp.clone();               
            
        }
        
        return answer;
    }
}