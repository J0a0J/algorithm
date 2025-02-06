import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length - 1;
        
        return numbers[len] * numbers[len - 1];
    }
}