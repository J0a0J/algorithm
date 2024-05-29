class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        for (int i = n; i >= a;  ) {
            // 전체 받은 병의 개수 += 몫(1병) * 받을 병의 개수 
            answer += (i / a) * b;
            // 남은 병의 개수 = 새로 받은 병 + 바꾼 뒤 남은 병(나머지)
            i = (i / a) * b + (i % a);
        }
        return answer;
    }
}