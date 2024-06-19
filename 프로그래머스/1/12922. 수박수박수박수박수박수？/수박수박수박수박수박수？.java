class Solution {
    public String solution(int n) {
        String answer = "";
        char[] tmp = new char[] {'수', '박'};
        int index = 0;
        for (int i = 0; i < n; i++) {
            answer += tmp[index];
            index++;
            if (index > 1) index = 0;
        }
        return answer;
    }
}