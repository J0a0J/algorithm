import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char c : my_string.toCharArray()) {
            int idx;
            if ('A' <= c && c <= 'Z') {
                idx = c - 'A';
            } else {
                idx = c - 'a' + 26;
            }
            answer[idx] += 1;
        }
        return answer;
    }
}