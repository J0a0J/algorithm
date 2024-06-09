class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        //  큰 값, 작은 값 구분하기
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        
        for (int i = small; i <= big; i++) {
            answer += i;
        }
        return answer;
    }
}