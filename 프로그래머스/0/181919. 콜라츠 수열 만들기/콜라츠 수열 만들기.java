import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList();
        
        IntStream.iterate(n, i -> i != 1, i -> (i % 2 == 0) ? i / 2 : 3 * i + 1).forEach(list::add);
        
        list.add(1);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}