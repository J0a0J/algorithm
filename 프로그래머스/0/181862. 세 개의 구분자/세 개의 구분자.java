import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]");
        
        List<String> list = new ArrayList(Arrays.asList(answer));
        list.removeIf(i -> i.isEmpty());
        
        return (list.size() == 0) ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}