import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 1. sides의 큰 값, 작은 값 구하기
        int bigNum = Arrays.stream(sides).max().getAsInt();
        int smallNum = Arrays.stream(sides).min().getAsInt();
        
        // 2-1. sides의 가장 큰 값이 가장 긴 변이라면
        for (int i = bigNum - smallNum; i <= bigNum; i++) {
            if (bigNum < smallNum + i) answer += 1;
            
        }
        
        // 2-2 미지의 값이 가장 긴 변이라면
        for (int i = bigNum + 1; i < bigNum + smallNum; i++) {
            if (i < bigNum + smallNum) answer += 1;
        }
        
        return answer;
    }
}