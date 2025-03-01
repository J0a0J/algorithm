import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        List<String> list = new ArrayList(Arrays.asList(answer));
        list.removeIf(s -> s.isEmpty());
        
        Collections.sort(list);
        
        
        return list.toArray(new String[0]);
    }
}