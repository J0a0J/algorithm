import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer =  Arrays.stream(arr).filter(a -> a % divisor == 0).toArray();
        // 맞아떨어지는 수가 없다면 -1
        if (answer.length == 0) {
            answer = new int[]{-1}; 
        }
        
        Arrays.sort(answer);
        return answer;
    }
}