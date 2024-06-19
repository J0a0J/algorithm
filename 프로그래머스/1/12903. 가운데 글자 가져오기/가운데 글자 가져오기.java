class Solution {
    public String solution(String s) {
        String answer = "";
        // 중간값
        int divide = s.length() / 2;
        // 짝수, 홀수일 때 구분하기
        answer = (s.length() % 2 == 0) ? s.substring(divide - 1, divide + 1) : s.substring(divide, divide + 1);

        return answer;
    }
}