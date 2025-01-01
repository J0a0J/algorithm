class Solution {
    public int[] solution(int n) {
        int[] answer = (n % 2 == 0) ? new int[n / 2] : new int[n / 2 + 1];
        for(int i = 0; i <= n; i++) {
        if (i % 2 == 0) {
            continue;
        } else {
            answer[i/2] = i;
        }
    }
        return answer;
    }
}