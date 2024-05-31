class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // i가 n의 약수라면 
                answer += i;
            }
        }
        return answer;
    }
}