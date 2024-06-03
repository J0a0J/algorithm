class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // 우선 문자열을 소문자로 만들어주기
        s = s.toLowerCase();
        // p, y의 개수를 세는 변수 
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') count++;
            else if(s.charAt(i) == 'y') count--;
        }
        
        if (count != 0) answer = false;

        return answer;
    }
}