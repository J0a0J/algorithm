import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        
        return IntStream.of(arr)
            .flatMap(i -> IntStream.generate(() -> i).limit(i))
            .toArray();
    }
}