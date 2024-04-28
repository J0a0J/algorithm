import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> array = new ArrayList<>();         
        array.add(arr[0]); // 첫번째 값은 무조건 들어가야 함.

        for(int i = 0; i < arr.length; i++) {
            if(array.get(array.size() - 1) == arr[i]) {
                continue;
            }
            array.add(arr[i]);
        }
        // array 값 옮기기
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}