class Solution {
    public int solution(int n) {
        int answer = 1, i = 1;
        while (answer * i <= n) {
            answer *= i;
            i++;
        }
        return i - 1;
    }
}
