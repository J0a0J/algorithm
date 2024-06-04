import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] charArray = String.valueOf(n).toCharArray();
        
        for(int i = 0; i < charArray.length; i++) {
            answer += charArray[i] - '0';
        }
        
        // 더 좋은 방법
        // while (n > 0) {
        //     answer += n % 10;
        //     n /= 10;
        // }
        
        return answer;
    }
}
