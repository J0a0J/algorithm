import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int idx = 0; // 인덱스
        
        while (idx < arr.length) {
            int num = arr[idx];

            if (stk.isEmpty()) {
                stk.add(num);
                idx++;
            } else {
                int lastValue = stk.get(stk.size() - 1);
                if (lastValue >= num) {
                    stk.remove(stk.size() - 1);
                } else {
                    stk.add(num);
                    idx++;
                }
            }
        }
        
        return stk.stream().mapToInt(i -> i).toArray();
    }
}
