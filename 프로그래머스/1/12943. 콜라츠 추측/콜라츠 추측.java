class Solution {
    public int solution(int num) {
        // 입력값이 크면 int 가 다룰 수 있는 범위를 넘어가기에 long에 저장
        long longNum = num;
        int answer = 0;
        while (longNum != 1) {
         if (longNum % 2 == 0) {
             longNum /= 2;
             answer++;
         } else {
             longNum = longNum * 3 + 1;
             answer++;
         }
            
            if (answer ==500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}