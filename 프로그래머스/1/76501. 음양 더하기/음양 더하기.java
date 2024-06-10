class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            // false 라면 -1, true 라면 1 로 한 뒤 주어질 값에 곱해준다.
            int sign = (signs[i] == false) ? -1 : 1;
            answer += sign * absolutes[i];
        }
        return answer;
    }
}