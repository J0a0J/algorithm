class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        if ((x1 == x2 && x1 == false) || (x3 == x4 && x3 == false)) return false; 
        return answer;
    }
}
