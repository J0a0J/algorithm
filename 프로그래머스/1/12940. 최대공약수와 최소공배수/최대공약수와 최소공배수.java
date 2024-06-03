class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tmp = n > m ? n : m;
        
        for (int i = 1; i < tmp; i++) {
            // 최대공약수 구하기
            if ((n % i) == 0 && (m % i) == 0) { // 나머지가 없을 때            
                answer[0] = i;
            }
        }
        // 최소공배수 구하기
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}