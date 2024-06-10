import java.util.Arrays;
import java.util.stream.IntStream;


class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i = 0; i < 10; i++) {
            int tmp = i;
            // numbers 배열에 현재 숫자 tmp가 없는 경우
            if (!IntStream.of(numbers).anyMatch(n -> n == tmp)) {
                answer += i;
            }
        }
        return answer;
    }
}