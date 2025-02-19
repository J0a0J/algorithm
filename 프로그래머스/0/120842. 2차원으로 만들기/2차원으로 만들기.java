class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        int[][] answer = new int[len][n];
        
        for (int i = 0; i < len; i++) {
            System.arraycopy(num_list, i * n, answer[i], 0, n);
        }
        
        return answer;
    }
}