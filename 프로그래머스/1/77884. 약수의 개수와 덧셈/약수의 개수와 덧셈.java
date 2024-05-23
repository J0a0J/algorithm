import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i = left; i <= right; i++) {
            for(int j = 1; j <= i; j++) { 
                // 나머지 없이 나누어질 경우 리스트에 저장.
                if (i % j == 0) {
                    ll.add(j);
                }
            }
            // 약수의 개수가 짝수인 경우
            if(ll.size() % 2 == 0) answer += i;
            else { answer -= i; } // 홀수인 경우
            ll.clear(); // 리스트 비우기
        }
        return answer;
    }
}