import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 0; i < food.length; i++) {
            int share = food[i] / 2;
            if (share != 0) {
                for (int j = 0; j < share; j ++){
                    answer += Integer.toString(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder(answer).reverse();
        answer += "0" + sb.toString();
        
        return answer;
    }
}