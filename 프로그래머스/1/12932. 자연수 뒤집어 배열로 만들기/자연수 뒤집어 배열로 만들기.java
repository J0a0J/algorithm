class Solution {
    public int[] solution(long n) {
        String tmp = String.valueOf(n);
        int len = tmp.length();
        
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = tmp.charAt(len - 1 - i) - '0';
        }
        return answer;
    }
}