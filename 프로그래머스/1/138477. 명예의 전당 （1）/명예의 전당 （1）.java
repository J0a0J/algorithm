import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] cal = new int[k];
        boolean zero = false;
        
        for(int i = 0; i < score.length; i++) {
            int minimum = cal[0];
            
            // 순위권의 가장 작은 값과 비교하여 인덱스 0에 넣음.
            if(score[i] > minimum || minimum == 0) {
                cal[0] = score[i];
            }
            Arrays.sort(cal);
            
            if(i < k) { 
                if(score[i] == 0) { zero = true; }
                else if (zero == false) { // 명예의 전당 순위권 안에 0이 없다면
                    // 0을 제외한 값을 최하위 점수로 지정.
                     int[] newArr = Arrays.stream(cal)
                             .filter(n -> n != 0)
                             .toArray();

                    answer[i] = newArr[0];
                    continue;
                }
            }
            
            answer[i] = cal[0];
        }
        return answer;
    }
}