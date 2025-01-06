class Solution {
    public int solution(int n) {
        int answer = 0;
        // 한 판에 7조각 이니까 7로 나누면 될 듯
        answer = n / 7;
        if (n % 7 > 0) {
            answer += 1;
        }
        
        return answer;
    }
}