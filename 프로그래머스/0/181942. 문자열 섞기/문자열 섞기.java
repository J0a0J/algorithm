class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        // 길이가 같은 2개의 문자열이 주어지니 str1.length() 사용해도 됨
        for(int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}