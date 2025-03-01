    import java.util.*;

    class Solution {
        public int[] solution(String myString) {
            List<Integer> answer = new ArrayList<>();

            int xPos = 0;

            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) == 'x') {
                    answer.add(i - xPos);
                    xPos = i + 1;
                }
            }
            
            answer.add(myString.length() - xPos);
            
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }