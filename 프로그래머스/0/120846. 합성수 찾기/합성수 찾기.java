class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i <= n; i++) {
            int tmp = 0; // 각 수의 약수 개수를 저장할 변수
            for(int j=1; j <= i; j++) {
                if ((i / j) > 0 && (i % j) == 0) { // 약수인지 확인하는 과정
                    tmp += 1;  // 약수 개수 증가
                }
            }
            if (tmp > 2) { // 약수가 3개 이상인 경우
                answer += 1; 
            }
        }
        return answer;
    }
}