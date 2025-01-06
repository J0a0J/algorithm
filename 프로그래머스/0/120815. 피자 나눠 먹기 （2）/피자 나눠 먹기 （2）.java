class Solution {
    public int solution(int n) {
        int answer = 0;
        int slices = 6; // 조각
        int max = 1; // 최대 공약수
        // 6을 기준으로 최소 공배수 찾기
        for (int i = 1; i <= n && i <= slices; i++) {
            if (n % i == 0 && slices % i == 0) {
                max = i;
            }
        } 
        int min = n * slices / max; // 최소공배수 
        answer = min / slices;
        
        return answer;
    }
}