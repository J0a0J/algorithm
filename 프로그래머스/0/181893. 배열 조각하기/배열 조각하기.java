import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> names = new ArrayList<>();
        for (int num : arr) names.add(num);
        
        for (int i = 0; i < query.length; i++) {
            names = new ArrayList<>(i % 2 == 0 ? names.subList(0, query[i] + 1) : names.subList(query[i], names.size()));
        }
        
        return names.stream().mapToInt(i -> i).toArray();
    }
}
