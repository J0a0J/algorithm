import java.util.*;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        
        int answer = 0;
        int times = Collections.max(map.values());
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (entry.getValue() == times) {
                Collections.max(map.values());
                answer = key;
                count++;}
            if (count > 1) {return -1;}
        }
        return answer;
    }
}