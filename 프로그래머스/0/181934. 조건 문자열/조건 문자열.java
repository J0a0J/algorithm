class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // < 일 때는 0, > 일 때는 1
        int compare = ineq.equals("<") ? 0 : 1;
        // = 일 때는 0, ! 일 때는 1
        int equal = eq.equals("=") ? 0 : 1;
        
        if (compare == 0) {
            return (equal == 0) ? (n <= m) ? 1 : 0 : (n < m) ? 1 : 0;
        } else {
            return (equal == 0) ?  (n >= m) ? 1: 0 : (n > m) ? 1: 0;
        }
    }
}