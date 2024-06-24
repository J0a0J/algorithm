import java.util.Arrays; 

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        // 길이 조건 : 4 또는 6
        if (s.length() == 4 || s.length() == 6) {
            for (char c : charArr) {
                // 숫자 조건 : 문자라면 9보다 큼
                if (c - '0' > 9) {
                    return false;
                } 
            }
            return answer;
        }
        return false;
    }
}