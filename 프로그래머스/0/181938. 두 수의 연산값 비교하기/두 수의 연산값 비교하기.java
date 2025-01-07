class Solution {
    public int solution(int a, int b) {
        
        int add = Integer.parseInt(a + "" + b);
        int multiply = 2 * a * b;
        
        return Math.max(add, 2*a*b);
    }
}