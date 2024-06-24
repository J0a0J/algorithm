class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        // 배열 길이
        int arrLen = a.length;
        
        for (int i = 0; i < arrLen; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}