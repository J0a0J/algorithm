class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = false; 

        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            
            if (current == '0' || current == '1') {
                mode = !mode; 
            } else if ((mode && i % 2 == 1) || (!mode && i % 2 == 0)) {
                answer.append(current);
            }
        }
            
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
