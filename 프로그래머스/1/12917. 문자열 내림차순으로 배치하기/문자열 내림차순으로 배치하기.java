import java.util.*;

class Solution {
    public String solution(String s) {
        
        char[] charArray = s.toCharArray();
        // 오름차순으로 정렬
        Arrays.sort(charArray);
        // 정렬된 문자열 뒤집기
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}