import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0], a2 = intervals[1][0], b1 = intervals[0][1], b2 = intervals[1][1];
        
        return IntStream.concat(
            IntStream.rangeClosed(a1, b1).map(i -> arr[i]),
            IntStream.rangeClosed(a2, b2).map(i -> arr[i])
        ).toArray();
    }
}