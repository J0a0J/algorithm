class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        answer = my_string.substring(s, e + 1);
        answer = my_string.replace(answer, new StringBuilder(answer).reverse().toString());
        
        return answer;
    }
}