import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int s = query[0], e = query[1];
            
            StringBuilder split = new StringBuilder(sb.substring(s, e + 1));
            sb.replace(s, e + 1, split.reverse().toString());
        }
        
        return sb.toString();
    }
}